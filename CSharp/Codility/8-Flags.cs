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

            int[] nextFlag = new int[A.Length];
            nextFlag[nextFlag.Length - 1] = -1;

            for (int i = nextFlag.Length - 2; i >= 0; --i)
            {
                if (peaks[i])
                    nextFlag[i] = i;
                else
                    nextFlag[i] = nextFlag[i + 1];
            }

            int result = 0;
            for (int i = 1; i * (i - 1) <= A.Length; ++i)
            {
                int currentFlagCount = 0;
                for (int pos = 0; pos < A.Length && nextFlag[pos] != -1; pos += i)
                {
                    pos = nextFlag[pos];
                    ++currentFlagCount;
                    if (currentFlagCount == i)
                        break;
                }
                result = Math.Max(result, currentFlagCount);
            }

            return result;
        }
    }
}
