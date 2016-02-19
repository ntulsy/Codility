using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CountTriangles
{
    public class Solution
    {
        public int solution(int[] A)
        {
            Array.Sort(A);
            int sum = 0;
            for (int p = 0; p < A.Length; ++p)
            {
                int r = p + 2;
                for (int q = p + 1; q < A.Length; ++q)
                {
                    while (r < A.Length && A[p] + A[q] > A[r])
                        ++r;
                    sum += (r - q - 1);
                }
            }
            return sum;
        }
    }
}