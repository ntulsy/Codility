using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Nesting
{
    public class Solution
    {
        public int solution(string S)
        {
            int counter = 0;
            foreach (var s in S)
            {
                if (s == '(')
                    ++counter;
                else if (s == ')')
                    --counter;
                if (counter < 0)
                    return 0;
            }
            return counter == 0 ? 1 : 0;
        }
    }
}
