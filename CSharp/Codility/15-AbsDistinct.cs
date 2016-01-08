using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AbsDistinct
{
    public class Solution
    {
        public int solution(int[] A)
        {
            int hasMin = 0;
            Dictionary<int, bool> dict = new Dictionary<int, bool>();
            for (int i = 0; i < A.Length; ++i)
            {
                if (A[i] == Int32.MinValue)
                    hasMin = 1;
                else
                    dict[Math.Abs(A[i])] = true;
            }
            return dict.Count + hasMin;
        }
    }
}