using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PermCheck
{
    public class Solution
    {
        public int solution(int[] A)
        {
            int[] markers = new int[A.Length];
            foreach (var a in A)
            {
                if (a > A.Length)
                    return 0;
                ++markers[a - 1];
            }
            foreach (var marker in markers)
            {
                if (marker != 1)
                {
                    return 0;
                }
            }
            return 1;
        }
    }
}
