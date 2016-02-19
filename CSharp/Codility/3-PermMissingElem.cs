using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PermMissingElem
{
    public class Solution
    {
        public int solution(int[] A)
        {
            Int64 actualSum = A.Sum(a => Convert.ToInt64(a));
            Int64 targetSum = Enumerable.Range(1, A.Length + 1).Sum(a => Convert.ToInt64(a));
            return Convert.ToInt32(targetSum - actualSum);
        }
    }
}
