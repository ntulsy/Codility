using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GenomicRangeQuery
{
    public class Solution
    {
        private int getImpactFactor(char c)
        {
            switch(c)
            {
                case 'A':
                    return 1;
                case 'C':
                    return 2;
                case 'G':
                    return 3;
                case 'T':
                    return 4;
            }
            throw new Exception("Invalid Genomic Sequence");
        }
        
        private int[] getCountOfX(int[] sequence, int x)
        {
            int[] count = new int[sequence.Length];
            for (int i = 1; i < sequence.Length; ++i)
            {
                count[i] = count[i - 1] + (sequence[i - 1] == x ? 1 : 0);
            }
            return count;
        }

        public int[] solution(string S, int[] P, int[] Q)
        {
            int[] sequence = new int[S.Length];
            for (int i = 0; i < sequence.Length; ++i)
            {
                sequence[i] = getImpactFactor(S[i]);
            }

            int [][] classCount = new int[4][];
            for (int i = 0; i < 4; ++i)
            {
                classCount[i] = getCountOfX(sequence, i + 1);
            }

            int[] result = new int[P.Length];
            for (int i = 0; i < P.Length; ++i)
            {
                int left = P[i];
                int right = Q[i];
                if (left == right)
                {
                    result[i] = sequence[left];
                    continue;
                }
                for (int j = 0; j < 4; ++j)
                {
                    if (classCount[j][left] != classCount[j][right] || sequence[right] == j + 1)
                    {
                        result[i] = j + 1;
                        break;
                    }
                }
            }
            return result;
        }
    }
}
