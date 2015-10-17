using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StoneWall
{
    public class Solution
    {
        public int solution(int[] H)
        {
            Stack<int> stack = new Stack<int>();
            int count = 0;
            foreach (var h in H)
            {
                while (stack.Count != 0 && stack.Peek() >= h)
                {
                    if (stack.Peek() > h)
                        ++count;
                    stack.Pop();
                }
                stack.Push(h);
            }
            return count + stack.Count;
        }
    }
}
