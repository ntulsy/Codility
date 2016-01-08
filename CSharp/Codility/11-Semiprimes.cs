using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Semiprimes
{
    public class Solution
    {
        public int[] solution(int N, int[] P, int[] Q)
        {
            int[] primes = getPrimes(N);
            bool[] isSubprime = Enumerable.Repeat<bool>(false, N + 1).ToArray();
            for (int i = 0; i < primes.Length; ++i)
            {
                for (int j = i;
                    primes[j] * primes[i] <= N && primes[j] * primes[i] > 0 && j < primes.Length;
                    ++j)
                {
                    isSubprime[primes[j] * primes[i]] = true;
                }
            }
            int[] subprimeCount = new int[N + 1];
            for (int i = 1; i < N + 1; ++i)
            {
                subprimeCount[i] = subprimeCount[i - 1] + (isSubprime[i] ? 1 : 0);
            }
            int[] returnValues = new int[P.Length];
            for (int i = 0; i < P.Length; ++i)
            {
                returnValues[i] = subprimeCount[Q[i]] - subprimeCount[P[i]] + (isSubprime[P[i]] ? 1 : 0);
            }
            return returnValues;
        }

        private int[] getPrimes(int n)
        {
            bool[] isPrime = Enumerable.Repeat<bool>(true, n + 1).ToArray();
            isPrime[0] = isPrime[1] = false;
            for (int i = 2; i * i <= n; ++i)
            {
                for (int j = i * i; j <= n; j += i)
                {
                    isPrime[j] = false;
                }
            }
            return isPrime
                .Select((value, index) => new { Value = value, Index = index })
                .Where(x => x.Value)
                .Select(x => x.Index)
                .ToArray();
        }
    }
}