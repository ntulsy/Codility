using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Brackets
{
    public class Solution
    {
        private static Dictionary<char, char> dict;
        static Solution()
        {
            dict = new Dictionary<char, char>();
            dict['}'] = '{';
            dict[']'] = '[';
            dict[')'] = '(';
        }
        public int solution(string S)
        {
            Stack<char> stack = new Stack<char>();
            foreach (var s in S)
            {
                if (dict.ContainsValue(s))
                {
                    stack.Push(s);
                }
                else if (dict.ContainsKey(s))
                {
                    if (stack.Count == 0 || stack.Peek() != dict[s])
                        return 0;
                    else
                        stack.Pop();
                }
            }
            return stack.Count == 0 ? 1 : 0;
        }
    }
}
