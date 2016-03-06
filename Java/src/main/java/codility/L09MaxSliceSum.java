package codility;

/**
 * Created by Boss on 17/10/15.
 */
public class L09MaxSliceSum {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int max_slice = 0, max_sofar = 0;
        int maxNegative = Integer.MIN_VALUE;
        for (int b : A) {
            maxNegative = Math.max(b,maxNegative);
        }
        if (maxNegative >= 0) {
            for (int a : A) {
                max_sofar = Math.max(max_sofar + a, 0);
                max_slice = Math.max(max_slice, max_sofar);
            }
        }else {
            return maxNegative;
        }
        return max_slice;
    }
}
