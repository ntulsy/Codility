using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EquiLeader
{
    // solved with external assistance
    public class Solution
    {
        public int solution(int[] A)
        {
            int leader = getLeader(A);
            int[] leaderCount = new int[A.Length];
            leaderCount[0] = A[0] == leader ? 1 : 0;
            for (int i = 1; i < A.Length; ++i)
            {
                leaderCount[i] = leaderCount[i - 1] + (A[i] == leader ? 1 : 0);
            }
            int totalLeaderCount = leaderCount[leaderCount.Length - 1];
            int equiLeaderCount = 0;
            for (int i = 0; i < leaderCount.Length - 1; ++i)
            {
                bool isLeftLeader = leaderCount[i] * 2 > i + 1;
                bool isRightLeader = (totalLeaderCount - leaderCount[i]) * 2 > leaderCount.Length - 1 - i;
                if (isLeftLeader && isRightLeader)
                    ++equiLeaderCount;
            }
            return equiLeaderCount;
        }

        public int getLeader(int[] H)
        {
            int stackValue = 0, stackCount = 0;
            foreach (var h in H)
            {
                if (stackCount == 0)
                {
                    ++stackCount;
                    stackValue = h;
                }
                else if (stackValue != h)
                    --stackCount;
                else if (stackValue == h)
                    ++stackCount;
            }
            if (stackCount > 0)
            {
                int count = 0;
                foreach (var h in H)
                {
                    if (h == stackValue)
                        ++count;
                }
                if (count > H.Length / 2)
                    return stackValue;
                else
                    return -1;
            }
            return -1;
        }
    }
}
