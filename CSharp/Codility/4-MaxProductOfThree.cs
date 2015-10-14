using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MaxProductOfThree
{
    public class Solution
    {
        public int solution(int[] A)
        {
            Array.Sort(A);
            return Math.Max(A[0] * A[1] * A[A.Length - 1], A[A.Length - 1] * A[A.Length - 2] * A[A.Length - 3]);
        }
    }
}