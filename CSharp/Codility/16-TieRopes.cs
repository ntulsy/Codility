using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TieRopes
{
    public class Solution
    {
        public int solution(int K, int[] A)
        {
            int currentSum = 0, count = 0;
            for (int i = 0; i < A.Length; i++)
            {
                currentSum += A[i];
                if (currentSum >= K)
                {
                    ++count;
                    currentSum = 0;
                }
            }
            return count;
        }
    }
}