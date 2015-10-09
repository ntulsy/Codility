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
            int lastSyncCounterValue = 0;
            foreach (var a in A)
            {
                if (a == N + 1)
                {
                    lastSyncCounterValue = currentMaxCounter;
                }
                else
                {
                    if (counters[a - 1] < lastSyncCounterValue)
                    {
                        counters[a - 1] = lastSyncCounterValue;
                    }
                    ++counters[a - 1];
                    if (counters[a - 1] > currentMaxCounter)
                    {
                        currentMaxCounter = counters[a - 1];
                    }
                }
            }
            for (int i = 0; i < counters.Length; ++i)
            {
                if (counters[i] < lastSyncCounterValue)
                {
                    counters[i] = lastSyncCounterValue;
                }
            }
            return counters;
        }
    }
}
