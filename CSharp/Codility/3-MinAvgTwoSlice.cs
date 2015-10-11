using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MinAvgTwoSlice
{
    // Solved with external assistance
    public class Solution
    {
        public int solution(int[] A)
        {
            double minAverage = A.Average();
            int startingPosition = 0;
            for (int width = 1; width <= 2; ++width)
            {
                for (int i = 0; i + width < A.Length; ++i)
                {
                    double sliceSum = 0;
                    for (int j = 0; j <= width; ++j)
                    {
                        sliceSum += A[i + j];
                    }
                    double sliceAverage = sliceSum / (width + 1);
                    if (sliceAverage < minAverage)
                    {
                        startingPosition = i;
                        minAverage = sliceAverage;
                    }
                }
            }
            return startingPosition;
        }
    }
}
