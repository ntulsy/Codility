package main;

/**
 * Created by Boss on 16/12/15.
 */
public class L14TieRopes {
    public int solution(int K, int[] A) {
        // write your code in Java SE 8
        int count = 0;
        int sum = 0;
        for (int i = 0; i < A.length; ++i) {
            sum += A[i];
            if (sum >= K) {
                sum = 0;
                ++count;
            }
        }
        return count;
    }
}
