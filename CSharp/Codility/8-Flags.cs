using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Flags
{
    public class Solution
    {
        public int solution(int[] A)
        {
            bool[] peaks = new bool[A.Length];

            for (int i = 1; i < A.Length - 1; ++i)
            {
                if (A[i - 1] < A[i] && A[i] > A[i + 1])
                    peaks[i] = true;
            }

            int maxFlagCount = Math.Max(peaks.Length, Convert.ToInt32(Math.Floor(Math.Sqrt(A.Length))));
            return 0;
        }
    }
}
