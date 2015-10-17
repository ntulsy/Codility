using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fish
{
    public class Solution
    {
        public int solution(int[] A, int[] B)
        {
            Stack<KeyValuePair<int, int>> remainingFish = new Stack<KeyValuePair<int, int>>();
            for (int i = 0; i < A.Length; ++i)
            {
                bool isEaten = false;
                if (B[i] == 0)
                {
                    while (remainingFish.Count != 0)
                    {
                        if (remainingFish.Peek().Value == 1)
                        {
                            if (remainingFish.Peek().Key < A[i])
                                remainingFish.Pop();
                            else
                            {
                                isEaten = true;
                                break;
                            }
                        }
                        else
                            break;
                    }
                }
                if (!isEaten)
                    remainingFish.Push(new KeyValuePair<int, int>(A[i], B[i]));
            }
            return remainingFish.Count;
        }
    }
}
