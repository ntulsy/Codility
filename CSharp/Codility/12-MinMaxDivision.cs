using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MinMaxDivision
{
    public class Solution
    {
        public int solution(int K, int M, int[] A)
        {
            int upperBound = (A.Length / K + 1) * M;
            int lowerBound = 0;
            int result = 0;
            while (upperBound >= lowerBound)
            {
                int mid = (upperBound + lowerBound) / 2;
                if (isValidDivision(A, K, mid))
                {
                    upperBound = mid - 1;
                    result = mid;
                }
                else
                    lowerBound = mid + 1;
            }
            return result;
        }

        private bool isValidDivision(int[] A, int K, int minLargestSumAllowed)
        {
            int divisionCount = 0;
            int currentSum = 0;
            int i = 0;
            while (i < A.Length)
            {
                if (A[i] > minLargestSumAllowed)
                    return false;
                currentSum += A[i];
                if (currentSum > minLargestSumAllowed)
                {
                    ++divisionCount;
                    currentSum = 0;
                    if (divisionCount >= K)
                        return false;
                }
                else
                {
                    ++i;
                }
            }
            return true;
        }
    }
}