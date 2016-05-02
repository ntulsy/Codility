using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ArrayInversionCount
{
    public class Solution
    {
        private static int MAX = (int)1E9;
        public int solution(int[] A)
        {
            return (int) mergeSort(A, 0, A.Length - 1);
        }

        private long mergeSort(int[] A, int left, int right)
        {
            if (left >= right)
                return 0;
            int mid = (left + right) / 2;
            long leftCount = mergeSort(A, left, mid);
            if (leftCount == -1)
                return -1;
            long rightCount = mergeSort(A, mid + 1, right);
            if (rightCount == -1)
                return -1;

            long currentCount = 0;
            int i = left, j = mid + 1;
            Queue<int> temp = new Queue<int>();
            while (i <= mid && j <= right)
            {
                if (A[i] <= A[j])
                    temp.Enqueue(A[i++]);
                else
                {
                    currentCount += (mid - i + 1);
                    if (currentCount > MAX)
                        return -1;
                    temp.Enqueue(A[j++]);
                }
            }

            while (i <= mid)
                temp.Enqueue(A[i++]);
            while (j <= right)
                temp.Enqueue(A[j++]);

            for (int k = left; k <= right; ++k)
                A[k] = temp.Dequeue();

            long totalCount = leftCount + rightCount + currentCount;
            return totalCount > MAX ? -1 : totalCount;
        }
    }
}