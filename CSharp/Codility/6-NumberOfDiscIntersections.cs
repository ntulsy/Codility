using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NumberOfDiscIntersections
{
    public class Solution
    {
        public int solution(int[] A)
        {
            List<KeyValuePair<int, long>> points = new List<KeyValuePair<int, long>>();
            for (int i = 0; i < A.Length; ++i)
            {
                points.Add(new KeyValuePair<int, long>(-1, Convert.ToInt64(i) - A[i])); // left - in
                points.Add(new KeyValuePair<int, long>(1, Convert.ToInt64(i) + A[i])); // right - out
            }
            List<KeyValuePair<int, long>> orderedPoints = points.OrderBy(p => p.Value)
                                                               .ThenBy(p => p.Key).ToList();
            int accumulatedIntersections = 0;
            int currentDiscCount = 0;
            for (int i = 0; i < orderedPoints.Count; ++i)
            {
                if (orderedPoints[i].Key < 0)
                {
                    accumulatedIntersections += currentDiscCount;
                    ++currentDiscCount;
                }
                else
                {
                    --currentDiscCount;
                }
                if (accumulatedIntersections > 1E7)
                    return -1;
            }
            return accumulatedIntersections;
        }
    }
}
