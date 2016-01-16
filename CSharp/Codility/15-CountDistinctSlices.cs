using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CountDistinctSlices
{
    public class Solution
    {
        public int solution(int M, int[] A)
        {
            int sum = 0;
            bool[] hasAppeared = new bool[M + 1];
            int start = 0, end = 0;
            while (start < A.Length)
            {
                if (end < A.Length)
                {
                    if (hasAppeared[A[end]])
                    {
                        sum += (end - start);
                        hasAppeared[A[start++]] = false;

                        if (sum > 1e9)
                            return (int)1e9;
                    }
                    else
                    {
                        hasAppeared[A[end]] = true;
                        ++end;
                    }
                }
                else
                {
                    while (start < A.Length)
                    {
                        sum += (end - start);
                        ++start;

                        if (sum > 1e9)
                            return (int)1e9;
                    }
                }
            }
            return sum;
        }
    }
}