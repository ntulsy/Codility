using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CountDiv
{
    public class Solution
    {
        public int solution(int A, int B, int K)
        {
            return numberOfExactDiv(B, K) - numberOfExactDiv(A - 1, K);
        }

        private int numberOfExactDiv(int a, int b)
        {
            if (a < 0)
                return 0;
            else
                return a / b + 1;
        }
    }
}
