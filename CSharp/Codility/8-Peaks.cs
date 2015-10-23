using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Peaks
{
    public class Solution
    {
        public int solution(int[] A)
        {
            bool[] peaks = new bool[A.Length];

            for (int i = 1; i < A.Length -1; ++i)
            {
                if (A[i - 1] < A[i] && A[i] > A[i + 1])
                    peaks[i] = true;
            } 
            List<int> divisors = getDivisors(A, peaks);
            int blockCount = 0;
            for (int i = 0; i < divisors.Count; ++i)
            {
                if (isValidBlockSegmentation(A, divisors[i], peaks))
                    blockCount = divisors[i];
            }
            return blockCount;
        }

        private List<int> getDivisors(int[] A, bool[] peaks)
        {
            int i;
            List<int> divisors = new List<int>();
            for (i = 1; i * i < peaks.Length; ++i)
            {
                if (A.Length % i == 0)
                {
                    divisors.Add(A.Length / i);
                    divisors.Add(i);
                }
            }
            if (i * i == A.Length)
                divisors.Add(i);
            divisors.Sort();
            return divisors;
        }

        public bool isValidBlockSegmentation(int[] A, int divisor, bool[] peaks)
        {
            int blockSize = A.Length / divisor;
            for (int i = 0; i < divisor; ++i)
            {
                bool isBlockValid = false;
                for (int j = i * blockSize; j < (i + 1) * blockSize; ++j)
                {
                    if (peaks[j])
                    {
                        isBlockValid = true;
                        break;
                    }
                }
                if (!isBlockValid)
                    return false;
            }
            return true;
        }
    }
}
