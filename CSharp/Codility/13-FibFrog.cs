using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FibFrog
{
    public class Solution
    {
        private const int FibArrayLength = 24;
        public int solution(int[] A)
        {
            int[] fib = new int[FibArrayLength];
            fib[0] = 1;  fib[1] = 2;
            for (int i = 2; i < FibArrayLength; ++i)
            {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
            int[] reached = new int[A.Length + 1];
            for (int i = 0; i < FibArrayLength; ++i)
            {
                int nextDestination = fib[i] - 1;
                if (nextDestination < reached.Length &&
                    (nextDestination == A.Length || A[nextDestination] == 1))
                    reached[nextDestination] = 1;
            }
            for (int i = 0; i < reached.Length - 1; i++)
			{
                if (reached[i] == 0)
                    continue;
                for (int j = 0; j < FibArrayLength; j++)
			    {
                    int nextDestination = i + fib[j];
                    if (nextDestination < reached.Length)
                    {
                        if ((nextDestination == A.Length || A[nextDestination] == 1) &&
                            (reached[nextDestination] > reached[i] || reached[nextDestination] == 0))
                        {
                            reached[nextDestination] = reached[i] + 1;
                        }
                    }
                    else
                        break;
			    }
			}
            return reached[A.Length] > 0 ? reached[A.Length] : -1;
        }
    }
}