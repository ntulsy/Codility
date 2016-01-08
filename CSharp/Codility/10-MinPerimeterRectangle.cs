using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MinPerimeterRectangle
{
    public class Solution
    {
        public int solution(int N)
        {
            int length = Convert.ToInt32(Math.Floor(Math.Sqrt(N)));
            if (length * length == N)
                return 4 * length;
            for (; length > 1; --length)
            {
                if (N % length == 0)
                {
                    int width = N / length;
                    return (width + length) * 2;
                }
            }
            return (length + N) * 2;
        }
    }
}
