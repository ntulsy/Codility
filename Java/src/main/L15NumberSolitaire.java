package main;

/**
 * Created by Boss on 18/12/15.
 */
public class L15NumberSolitaire {
    public int solution(int[] A) {
        int[] dp = new int[A.length];
        for (int j = 1; j < A.length; ++j)
            dp[j] = Integer.MIN_VALUE;
        dp[0] = A[0];

        for (int i = 1; i < A.length; ++i) {
            for (int move = 1; move <= 6; ++move) {
                if (move <= i)
                    dp[i] = Math.max(dp[i], dp[i - move] + A[i]);
                else
                    break;
            }
        }
        return dp[A.length - 1];
    }
}
