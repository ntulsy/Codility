using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DwarfsRafting
{
    public class Solution
    {
        private const int BARREL = 1;
        private const int OCCUPIED = 2;
        public int solution(int N, string S, string T)
        {
            string[] barrels = S.Split(' ');
            string[] occupiedSeats = T.Split(' ');
            int[,] seats = new int[N, N];
            if (!String.IsNullOrEmpty(S))
                foreach (var s in barrels)
                    seats[Convert.ToInt32(s.Substring(0, s.Length - 1)) - 1, s[s.Length - 1] - 'A'] = BARREL;
            if (!String.IsNullOrEmpty(T))
                foreach (var s in occupiedSeats)
                    seats[Convert.ToInt32(s.Substring(0, s.Length - 1)) - 1, s[s.Length - 1] - 'A'] = OCCUPIED;
            int[] quadrantWeight = new int[4];
            int[] quadrantBarrels = new int[4];
            for (int i = 0; i < N; ++i)
            {
                for (int j = 0; j < N; ++j)
                {
                    if (seats[i, j] == BARREL)
                        ++quadrantBarrels[getQuadrant(i, j, N)];
                    else if (seats[i, j] == OCCUPIED)
                        ++quadrantWeight[getQuadrant(i, j, N)];
                }
            }
            int[] quadrantAvailableSeats = Enumerable.Repeat((int)Math.Pow(N / 2, 2), 4)
                .Zip(quadrantBarrels, (a, b) => a - b)
                .Zip(quadrantWeight, (a, b) => a - b)
                .ToArray();
            return balanceFerry(quadrantAvailableSeats, quadrantWeight);
        }

        private int balanceFerry(int[] quadrantAvailableSeats, int[] quadrantWeight)
        {
            int count = 0;
            for (int i = 0; i < 4; ++i)
            {
                int weightDifference = 0;
                if (i == 0 || i == 3)
                    weightDifference = Math.Max(quadrantWeight[0], quadrantWeight[3]) - quadrantWeight[i];
                else
                    weightDifference = Math.Max(quadrantWeight[1], quadrantWeight[2]) - quadrantWeight[i];
                if (quadrantAvailableSeats[i] < weightDifference)
                    return -1;
                else
                {
                    quadrantAvailableSeats[i] -= weightDifference;
                    count += weightDifference;
                }
            }
            count += Math.Min(quadrantAvailableSeats[0], quadrantAvailableSeats[3]) * 2;
            count += Math.Min(quadrantAvailableSeats[1], quadrantAvailableSeats[2]) * 2;
            return count;
        }

        private int getQuadrant(int row, int column, int N)
        {
            if (row < N / 2)
                if (column < N / 2)
                    return 0;
                else
                    return 1;
            else
            {
                if (column < N / 2)
                    return 2;
                else
                    return 3;
            }
        }
    }
}