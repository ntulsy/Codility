using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ChocolatesByNumbers
{
    public class Solution
    {
        public int solution(int N, int M)
        {
            int gcd = 0;
            if (N >= M)
                gcd = getGcd(N, M);
            else
                gcd = getGcd(M, N);
            long lcm = ((long)N * (long)M) / (long)gcd;
            return Convert.ToInt32(lcm / M);
        }

        // a > b
        private int getGcd(int a, int b)
        {
            if (a % b == 0)
                return b;
            else
                return getGcd(b, a % b);
        }
    }
}