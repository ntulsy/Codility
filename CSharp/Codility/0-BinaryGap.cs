using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BinaryGap
{
    public class Solution
    {
        public int solution(int N)
        {
            string binaryRepresentation = Convert.ToString(N, 2);
            int max = 0;
            int current = 0;
            foreach (char c in binaryRepresentation){
                if (c == '1')
                {
                    if (current > max)
                        max = current;
                    current = 0;
                }
                else
                    ++current;
            }
            return max;
        }
    }
}
