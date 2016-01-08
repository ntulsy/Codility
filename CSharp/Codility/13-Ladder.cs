using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ladder
{
    public class Solution
    {
        private static int calculatedUntil = 1;
        public int[] solution(int[] A, int[] B)
        {
            int[] result = new int[A.Length];
            int[] fib = new int[A.Length + 1];
            fib[0] = fib[1] = 1;
            for (int i = 0; i < A.Length; ++i)
            {
                int count = getFib(fib, A[i]);
                result[i] = getMod(count, B[i]);
            }
            return result;
        }

        private int getMod(int count, int factor)
        {
            return count & (Int32.MaxValue >> (31 - factor));
        }

        private int getFib(int[] fib, int requiredPosition)
        {
            for (int i = calculatedUntil + 1; i <= requiredPosition; ++i)
            {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
            if (calculatedUntil < requiredPosition)
                calculatedUntil = requiredPosition;
            return fib[requiredPosition];
        }
    }
}