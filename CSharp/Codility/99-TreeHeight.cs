using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TreeHeight
{
    public class Solution
    {
        public int solution(Tree T)
        {
            if (T == null)
                return -1;
            return Math.Max(solution(T.l), solution(T.r)) + 1;
        }
    }

    public class Tree
    {
        public int x;
        public Tree l;
        public Tree r;
    }
}