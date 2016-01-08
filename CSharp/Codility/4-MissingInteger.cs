using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MissingInteger
{
    public class Solution
    {
        public int solution(int[] A)
        {
            bool[] hasOccured = new bool[A.Length];
            foreach (var a in A)
            {
                if (a <= A.Length && a > 0)
                {
                    hasOccured[a - 1] = true;
                }
            }
            int i = 0;
            for ( ; i < hasOccured.Length; ++i)
            {
                if (!hasOccured[i])
                {
                    return i + 1;
                }
            }
            return i + 1;
        }
    }
}
