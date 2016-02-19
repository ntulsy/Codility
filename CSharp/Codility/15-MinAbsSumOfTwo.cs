using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MinAbsSumOfTwo
{
    public class Solution
    {
        public int solution(int[] A)
        {
            Array.Sort(A);
            int i = 0, j = A.Length - 1;
            int min = Int32.MaxValue, currentSum = Int32.MaxValue;
            while (i <= j)
            {
                currentSum = A[i] + A[j];
                if (Math.Abs(currentSum) < min)
                    min = Math.Abs(currentSum);
                if (currentSum < 0)
                    ++i;
                else if (currentSum > 0)
                    --j;
                else
                    break;
            }
            return min;
        }
    }
}