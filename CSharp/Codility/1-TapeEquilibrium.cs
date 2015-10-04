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
            int[] SumLeft = new int[A.Length];
            int[] SumRight = new int[A.Length];
            SumLeft[0] = 0;
            for (int i = 1; i < A.Length; ++i)
            {
                SumLeft[i] = SumLeft[i - 1] + A[i - 1];
            }
            SumRight[A.Length - 1] = A[A.Length - 1];
            for (int i = A.Length - 2; i >= 0; --i)
            {
                SumRight[i] = SumRight[i + 1] + A[i];
            }
            int result = Int32.MaxValue;
            for (int i = 1; i < A.Length; ++i)
            {
                int diff = Math.Abs(SumLeft[i] - SumRight[i]);
                if (diff < result)
                    result = diff;
            }
            return result;
        }
    }
}
