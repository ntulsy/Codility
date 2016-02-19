using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StrSymmetryPoint
{
    public class Solution
    {
        public int solution(string S)
        {
            int start = 0, end = S.Length - 1;
            if (S.Length % 2 == 0)
                return -1;
            while (start < end)
            {
                if (S[start] != S[end])
                    return -1;
                ++start;
                --end;
            }
            return S.Length / 2;
        }
    }
}