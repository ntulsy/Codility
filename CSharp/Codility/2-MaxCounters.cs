using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MaxCounters
{
    public class Solution
    {
        public int[] solution(int N, int[] A)
        {
            int[] counters = new int[N];
            int currentMaxCounter = 0;
            foreach (var a in A)
            {
                if (a == N + 1)
                {
                    currentMaxCounter += counters.Max();
                    for (int i = 0; i < counters.Length; ++i)
                    {
                        counters[i] = 0;
                    }
                }
                else
                {
                    ++counters[a - 1];
                }
            }
            for (int i = 0; i < counters.Length; ++i)
            {
                counters[i] += currentMaxCounter;
            }
            return counters;
        }
    }
}
