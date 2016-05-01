using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NailingPlanks
{
    public class Solution
    {
        public int solution(int[] A, int[] B, int[] C)
        {
            int result = -1;
            var nails = C
                .Select((x, i) => new KeyValuePair<int, int>(x, i))
                .OrderBy(x => x.Key)
                .ToList();
            for (int i = 0; i < A.Length; i++)
            {
                var plankResult = findNailForPlank(A[i], B[i], nails, result);
                if (plankResult == -1)
                    return -1;
                else
                    result = Math.Max(result, plankResult);
            }
            return result + 1;
        }

        private int findNailForPlank(int plankStart, int plankEnd, List<KeyValuePair<int, int>> nails, int previousResult)
        {
            int lowerBound = 0, upperBound = nails.Count - 1, mid = 0;
            bool found = false;
            while (!found && upperBound >= lowerBound)
            {
                mid = (upperBound + lowerBound) / 2;
                int nailPosition = nails[mid].Key;
                if (nailPosition < plankStart)
                    lowerBound = mid + 1;
                else if (nailPosition > plankEnd)
                    upperBound = mid - 1;
                else
                    found = true;
            }
            if (!found)
                return -1;
            int firstNail = nails.Count;
            for (int i = mid; i < nails.Count && nailOnPlank(nails[i], plankStart, plankEnd); i++)
            {
                firstNail = Math.Min(nails[i].Value, firstNail);
                if (firstNail < previousResult)
                    return previousResult;
            }
            for (int i = mid; i >= 0 && nailOnPlank(nails[i], plankStart, plankEnd); i--)
            {
                firstNail = Math.Min(nails[i].Value, firstNail);
                if (firstNail < previousResult)
                    return previousResult;
            }
            return firstNail;
        }

        private bool nailOnPlank(KeyValuePair<int, int> nail, int plankStart, int plankEnd)
        {
            return nail.Key >= plankStart && nail.Key <= plankEnd;
        }
    }
}