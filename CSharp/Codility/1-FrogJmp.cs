using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FrogJmp
{
    public class Solution
    {
        public int solution(int X, int Y, int D)
        {
            return Convert.ToInt32(Math.Ceiling( ((double) (Y - X)) / (double) D));
        }
    }
}
