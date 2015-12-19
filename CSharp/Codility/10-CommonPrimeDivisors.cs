using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CommonPrimeDivisors
{
    public class Solution
    {
        public int solution(int[] A, int[] B)
        {
            int count = 0;
            for (int i = 0; i < A.Length; ++i)
            {
                int gcd = getGcd(A[i], B[i]);
                if (checkFactor(A[i] / gcd, gcd) && checkFactor(B[i] / gcd, gcd))
                    ++count;
            }
                return count;
        }

        private Boolean checkFactor(int quotient, int gcd)
        {
            int newGcd = getGcd(quotient, gcd);
            while (newGcd > 1)
            {
                quotient /= newGcd;
                newGcd = getGcd(quotient, newGcd);
            }
            if (quotient == 1)
                return true;
            else
                return false;
        }
        
        private int getGcd(int a, int b)
        {
            if (a < b)
            {
                int temp = b;
                b = a;
                a = temp;
            }
            if (a % b == 0)
                return b;
            else
                return getGcd(b, a % b);
        }
    }
}