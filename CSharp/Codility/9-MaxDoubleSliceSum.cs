using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MaxDoubleSliceSum
{
    // solved with external assistance
    public class Solution
    {
        public int solution(int[] A)
        {
            int[] dpL = new int[A.Length];
            int[] dpR = new int[A.Length];
            // dpL and dpR: max slice until current position from left and right
            // excluding current position
            for (int i = 2; i < A.Length; ++i)
            {
                dpL[i] = Math.Max(0, dpL[i - 1] + A[i - 1]);
            }
            for (int i = A.Length - 3; i >= 0; --i)
            {
                dpR[i] = Math.Max(0, dpR[i + 1] + A[i + 1]);
            }
            int maxSlice = 0;
            // The middle slice cannot be head or tail
            for (int i = 1; i < A.Length - 1; ++i)
            {
                maxSlice = Math.Max(maxSlice, dpL[i] + dpR[i]);
            }
            return maxSlice;
        }
    }
}
