using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FrogRiverOne
{
    public class Solution
    {
        public int solution(int X, int[] A)
        {
            int currentPosition = -1;
            int[] river = new int[X];
            for (int i = 0; i < A.Length; ++i)
            {
                river[A[i] - 1] = 1;
                while (river[currentPosition + 1] == 1)
                {
                    ++currentPosition;
                    if (currentPosition == X - 1)
                        return i;
                }
            }
            return -1;
        }
    }
}
