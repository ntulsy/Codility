using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Dominator
{
    public class Solution
    {
        public int solution(int[] H)
        {
            int stackValue = 0, stackCount = 0;
            foreach(var h in H)
            {
                if (stackCount == 0)
                {
                    ++stackCount;
                    stackValue = h;
                }
                else if (stackValue != h)
                    --stackCount;
                else if (stackValue == h)
                    ++stackCount;
            }
            if (stackCount > 0)
            {
                int count = 0;
                foreach(var h in H)
                {
                    if (h == stackValue)
                        ++count;
                }
                if (count > H.Length / 2)
                    return Array.IndexOf(H, stackValue);
                else
                    return -1;
            }
            return -1;
        }
    }
}
