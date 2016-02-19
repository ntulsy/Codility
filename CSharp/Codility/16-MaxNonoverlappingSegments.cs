using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MaxNonoverlappingSegments
{
    public class Solution
    {
        public int solution(int[] A, int[] B)
        {
            int filledUpTo = -1;
            int count = 0;
            for (int i = 0; i < A.Length; ++i)
            {
                if (A[i] > filledUpTo)
                {
                    filledUpTo = B[i];
                    ++count;
                }
            }
            return count;
        }
    }
}