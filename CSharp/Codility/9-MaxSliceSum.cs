using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MaxSliceSum
{
    public class Solution
    {
        public int solution(int[] A)
        {
            if (Array.TrueForAll(A, a => a <= 0))
                return A.Max();
            int maxSumCurrent = 0;
            int maxSumTotal = 0;
            for (int i = 0; i < A.Length; ++i)
            {
                maxSumCurrent = Math.Max(0, maxSumCurrent + A[i]);
                maxSumTotal = Math.Max(maxSumTotal, maxSumCurrent);
            }
            return maxSumTotal;
        }
    }
}
