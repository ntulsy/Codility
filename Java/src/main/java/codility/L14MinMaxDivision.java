package codility;

/**
 * Created by Boss on 16/12/15.
 */
public class L14MinMaxDivision {
    public int solution(int K, int M, int[] A) {
        // write your code in Java SE 8
        int sum = 0;
        int max = 0;
        for (int a : A) {
            sum += a;
            if (a > max)
                max = a;
        }

        int beg = max;
        int end = sum;
        int result = -1;
        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (check(A, mid) <= K){
                end = mid - 1;
                result = mid;
            }
            else
                beg = mid + 1;
        }
        return result;
    }

    public int check(int[] A, int sum) {
        int count = 1;
        int current = 0;
        for(int i = 0; i < A.length; ++i) {
            if (A[i] > sum - current) {
                ++count;
                current = A[i];
            }
            else
                current += A[i];
        }
        return count;
    }
}
