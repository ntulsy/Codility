using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PolygonConcavityIndex
{
    public class Solution
    {
        private const int STRAIGHT = 0;
        private const int LEFT = -1;
        private const int RIGHT = 1;
        public int solution(Point2D[] A)
        {
            int minY = A[0].y;
            List<int> minYIndex = new List<int>();
            for (int i = 0; i < A.Length; ++i)
            {
                if (A[i].y < minY)
                {
                    minY = A[i].y;
                    minYIndex.Clear();
                    minYIndex.Add(i);
                }
                else if (A[i].y == minY)
                    minYIndex.Add(i);
            }

            int start = minYIndex[0];
            for (int i = 1; i < minYIndex.Count; ++i)
            {
                if (start == minYIndex[i] - 1)
                    start = minYIndex[i];
            }

            int direction = getDirection(A[(start - 1 + A.Length) % A.Length], A[start], A[(start + 1) % A.Length]);

            for (int i = start; i < A.Length + start; i++)
            {
                if (direction * getDirection(A[(i - 1 + A.Length) % A.Length], A[i % A.Length], A[(i + 1) % A.Length]) < 0)
                    return i % A.Length;
            }
            return -1;
        }

        private int getDirection(Point2D A, Point2D B, Point2D C)
        {
            long crossProduct = ((long)B.x - (long)A.x) * ((long)C.y - (long)A.y) - ((long)C.x - (long)A.x) * ((long)B.y - (long)A.y);
            return crossProduct < 0 ? RIGHT : (crossProduct > 0 ? LEFT : STRAIGHT);
        }
    }

    public class Point2D
    {
        public int x;
        public int y;
    }
}