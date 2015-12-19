package main;

/**
 * Created by Boss on 18/12/15.
 */
public class L15MinAbsSum {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int max = 0;
        int sum = 0;
        for (int i = 0; i < A.length; ++i) {
            A[i] = Math.abs(A[i]);
            max = Math.max(max, A[i]);
            sum += A[i];
        }

        int[] count = new int[max + 1];
        for (int a : A)
            count[a]++;

        int[] S = new int[sum + 1];
        for (int s = 1; s <= sum; ++s)
            S[s] = -1;
        for (int j = 1; j <= max; ++j) {
            if (count[j] > 0) {
                for (int k = 0; k < sum; ++k) {
                    if (S[k] >= 0)
                        S[k] = count[j];
                    else if (k >= j && S[k - j] > 0)
                        S[k] = S[k - j] - 1;
                }
            }
        }

        int result = sum;
        for (int l = 0; l <= sum/2; ++l) {
            if (S[l] >= 0)
                result = Math.min(result, sum - 2 * l);
        }
        return result;
    }

    public int sub_solution(int[] A) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < A.length; ++i) {
            A[i] = Math.abs(A[i]);
            max = Math.max(max, A[i]);
            sum += A[i];
        }
        int[] S = new int[sum + 1];
        S[0] = 1;
        for (int j = 0; j < A.length; ++j) {
            int tmp = sum - A[j];
            for (int k = tmp; k >= 0; --k) {
                if (S[k] == 1)
                    S[k + A[j]] = 1;
            }
        }

        int result = sum;
        for (int l = 0; l <= sum/2; ++l) {
            if (S[l] == 1)
                result = Math.min(result, sum - 2 * l);
        }
        return result;
    }
}
