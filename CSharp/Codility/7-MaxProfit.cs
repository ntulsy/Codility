using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MaxProfit
{
    // solved with external assistance
    public class Solution
    {
        public int solution(int[] A)
        {
            int maxProfitCurrent = 0;
            int maxProfitTotal = 0;
            for (int i = 1; i < A.Length; ++i)
            {
                maxProfitCurrent = Math.Max(0, maxProfitCurrent + A[i] - A[i - 1]);
                maxProfitTotal = Math.Max(maxProfitTotal, maxProfitCurrent);
            }
            return maxProfitTotal;
        }
    }
}
