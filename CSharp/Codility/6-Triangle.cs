using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Triangle
{
    public class Solution
    {
        public int solution(int[] A)
        {
            if (A.Length < 3)
            { 
                return 0;
            }
            Array.Sort(A);
            for (int i = 2; i < A.Length; ++i)
            {
                if (canFormTriangle(A[i - 2], A[i - 1], A[i]))
                {
                    return 1;
                }
            }
            return 0;
        }
        public bool canFormTriangle(long i, long j, long k)
        {
            return (i + j > k) && (j + k > i) && (i + k > j);
        }
    }
}
