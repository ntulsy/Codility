using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RectangleBuilderGreaterArea
{
    public class Solution
    {
        private const int MAX = (int)1E9;
        public int solution(int[] A, int X)
        {
            long count = 0;
            var occurenceCount = A
                .GroupBy(x => x)
                .Where(x => x.Count() > 1)
                .Select(x => new KeyValuePair<int, int>(x.Key, Math.Min(x.Count() / 2, 2)))
                .OrderBy(x => x.Key)
                .ToList();
            for (int i = 0; i < occurenceCount.Count; i++)
            {
                var targetMultiplier = (int)Math.Ceiling(((double)X) / ((double)occurenceCount[i].Key));
                // case: more than four pieces with the same length
                var left = occurenceCount[i].Value > 1 ? i : i + 1;
                // It is already the last piece. Array out of bound
                if (left >= occurenceCount.Count)
                    break;
                var right = occurenceCount.Count - 1;
                var index = searchForMultiplier(occurenceCount, left, right, targetMultiplier);
                count += (occurenceCount.Count - index);
                if (count > MAX)
                    return -1;
            }
            return (int)count;
        }

        private int searchForMultiplier(List<KeyValuePair<int, int>> occurenceCount, int left, int right, int target)
        {
            while (left < right){
                int mid = (left + right) / 2;
                if (occurenceCount[mid].Key < target)
                    left = mid + 1;
                else
                    right = mid - 1;
            }
            if (occurenceCount[left].Key < target)
                ++left;
            return left;
        }
    }
}