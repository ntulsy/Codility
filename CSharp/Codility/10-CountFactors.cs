using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CountFactors
{
    public class Solution
    {
        public int solution(int N)
        {
            int count = 0;
            int i;
            for (i = 1; (long)i * (long)i < (long)N; ++i)
            {
                if (N % i == 0)
                    count += 2;
            }
            return (i * i == N) ? ++count : count;
        }
    }
}
