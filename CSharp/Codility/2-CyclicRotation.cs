using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CyclicRotation
{
    public class Solution
    {
        public int[] solution(int[] A, int K)
        {
            if (A.Length == 0)
                return A;
            int[] result = new int[A.Length];
            int rotationCount = K % A.Length;
            for (int i = 0; i < result.Length; i++)
            {
                result[i] = i < rotationCount ? 
                    A[A.Length - rotationCount + i] : 
                    A[i - rotationCount]; 
            }
            return result;
        }
    }
}
