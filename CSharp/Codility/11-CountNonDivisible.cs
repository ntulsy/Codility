using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CountNonDivisible
{
    // Solved with assistance
    public class Solution
    {
        public int[] solution(int[] A)
        {
            Dictionary<int, int> elementCount = new Dictionary<int, int>();
            foreach (var a in A)
            {
                if (elementCount.ContainsKey(a))
                    elementCount[a] = elementCount[a] + 1;
                else
                    elementCount[a] = 1;
            }

            Dictionary<int, HashSet<int>> divisorsOfElements = new Dictionary<int, HashSet<int>>();
            foreach (var element in elementCount.Keys)
            {
                divisorsOfElements[element] = new HashSet<int>(new int[] {1, element});
            }
            int maxInA = A.Max();
            for (int i = 2; i * i <= maxInA; ++i)
            {
                int element = i;
                while (element <= maxInA)
                {
                    if (divisorsOfElements.ContainsKey(element) 
                        && !divisorsOfElements[element].Contains(i))
                    {
                        divisorsOfElements[element].Add(i);
                        divisorsOfElements[element].Add(element / i);
                    }
                    element += i;
                }
            }

            int[] results = new int[A.Length];
            for (int i = 0; i < A.Length; ++i)
            {
                int divisibleCount = divisorsOfElements[A[i]]
                    .Select(x => elementCount.ContainsKey(x) ? elementCount[x] : 0)
                    .Sum();
                results[i] = A.Length - divisibleCount;
            }

            return results;
        }
    }
}