using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PassingCars
{
    public class Solution
    {
        public int solution(int[] A)
        {
            int[] headingWestCount = new int[A.Length];
            headingWestCount[A.Length - 1] = (A[A.Length - 1] == 1) ? 1 : 0;
            for (int i = A.Length - 2; i >= 0; --i)
            {
                headingWestCount[i] = headingWestCount[i + 1] + ((A[i] == 1) ? 1 : 0);
            }
            int crossingCount = 0;
            for (int i = 0; i < A.Length; ++i)
            {
                crossingCount += (A[i] == 0 ? headingWestCount[i] : 0);
                if (crossingCount > (int) 1E9)
                    return -1;
            }
            return crossingCount;
        }
    }
}
