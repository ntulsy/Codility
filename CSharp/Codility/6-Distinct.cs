using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Distinct
{
    public class Solution
    {
        public int solution(int[] A)
        {
            Dictionary<int, bool> dict = new Dictionary<int, bool>();
            foreach (var a in A)
            {
                dict[a] = true;
            }
            return dict.Count;
        }
    }
}
