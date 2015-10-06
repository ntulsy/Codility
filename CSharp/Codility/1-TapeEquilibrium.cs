using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TapeEquilibrium
{
    public class Solution
    {
        public int solution(int[] A)
        {
            int[] sumLeft = new int[A.Length];
            int[] sumRight = new int[A.Length];
            sumLeft[0] = 0;
            for (int i = 1; i < A.Length; ++i)
            {
                sumLeft[i] = sumLeft[i - 1] + A[i - 1];
            }
            sumRight[A.Length - 1] = A[A.Length - 1];
            for (int i = A.Length - 2; i >= 0; --i)
            {
                sumRight[i] = sumRight[i + 1] + A[i];
            }
            int result = Int32.MaxValue;
            for (int i = 1; i < A.Length; ++i)
            {
                int diff = Math.Abs(sumLeft[i] - sumRight[i]);
                if (diff < result)
                    result = diff;
            }
            return result;
        }
    }
}
