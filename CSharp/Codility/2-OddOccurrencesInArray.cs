using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OddOccurrencesInArray
{
    public class Solution
    {
        public int solution(int[] A)
        {
            Dictionary<int, bool> isUnpaired = new Dictionary<int, bool>();
            foreach (int a in A)
            {
                if (isUnpaired.ContainsKey(a))
                    isUnpaired.Remove(a);
                else
                    isUnpaired[a] = true;
            }
            return isUnpaired.Keys.ElementAt(0);
        }
    }
}
