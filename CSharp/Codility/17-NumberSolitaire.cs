using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NumberSolitaire
{
    public class Solution
    {
        public int solution(int[] A)
        {
            int[] maxSoFar = new int[A.Length + 6];
            for (int i = 0; i <= 6; ++i)
            {
                maxSoFar[i] = A[0];
            }
            for (int i = 7; i < maxSoFar.Length; i++)
            {
                maxSoFar[i] = maxSoFar.SubArray(i - 6, 6).Max() + A[i - 6];
            }
            return maxSoFar[maxSoFar.Length - 1];
        }
    }

    public static class ArrayExtension
    {
        public static T[] SubArray<T>(this T[] data, int index, int length)
        {
            T[] result = new T[length];
            Array.Copy(data, index, result, 0, length);
            return result;
        }
    }
}