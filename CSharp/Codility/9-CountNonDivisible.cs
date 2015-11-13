using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CountNonDivisible
{
    public class Solution
    {
        public int[] solution(int[] A)
        {
            SortedDictionary<int, int> elementCount = new SortedDictionary<int, int>();
            foreach (var a in A)
            {
                if (elementCount.ContainsKey(a))
                    elementCount[a] = elementCount[a] + 1;
                else
                    elementCount[a] = 1;
            }

            return null;
        }
    }
}