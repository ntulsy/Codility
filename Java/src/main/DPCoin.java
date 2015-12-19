package main;

/**
 * Created by Boss on 18/12/15.
 */
public class DPCoin {
    public int[] dynamicCoin(int[] C, int k) {
        int[][] dp = new int[C.length + 1][k + 1];
        for (int i = 1; i <= k; ++i)
            dp[0][i] = Integer.MAX_VALUE;

        for (int j = 1; j <= C.length; ++j) {
            for (int l = 0; l < C[j - 1]; ++l)
                dp[j][l] = dp[j - 1][l];
            for (int m = C[j - 1]; m <= k; ++m)
                dp[j][m] = Math.min(dp[j - 1][m], dp[j][m - C[j - 1]] + 1);
         }
        return dp[C.length];
    }

    public int[] opticmalCoin(int[] C, int k) {
        int[] dp = new int[k + 1];
        for (int i = 1; i <= k; ++i)
            dp[i] = Integer.MAX_VALUE;

        for (int j = 1; j <= C.length; ++j) {
            for (int m = C[j - 1]; m <= k; ++m)
                dp[m] = Math.min(dp[m], dp[m - C[j - 1]] + 1);
        }
        return dp;
    }
}
