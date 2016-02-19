package codility;

/**
 * Created by Boss on 18/12/15.
 */
public class DPFrog {
    public int dynamicFrog(int[] S, int k, int q) {
        int[] dp = new int[k + 1];
        dp[0] = 1;
        for (int i = 0; i <= k; ++i) {
            for (int s : S) {
                if (s < i)
                    dp[i] = (dp[i] + dp[i - s]) % q;
                else
                    break;
            }
        }
        return dp[k];
    }
}
