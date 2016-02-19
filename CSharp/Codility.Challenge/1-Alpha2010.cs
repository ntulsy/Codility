using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Alpha2010
{
    public class Solution
    {
        public int solution(int[] A)
        {
            Dictionary<int, bool> appeared = new Dictionary<int, bool>(A.Length);
            foreach (int a in A)
            {
                appeared[a] = true;
            }
            for (int i = 0; i < A.Length; ++i)
            {
                if (appeared.ContainsKey(A[i]))
                    appeared.Remove(A[i]);
                if (appeared.Count == 0)
                    return i;
            }
            return A.Length - 1;
        }
    }
}
