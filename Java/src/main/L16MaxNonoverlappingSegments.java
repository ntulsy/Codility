package main;

/**
 * Created by Boss on 16/12/15.
 */
public class L16MaxNonoverlappingSegments {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        if (A.length == 0)
            return 0;
        int end = B[0];
        int count = 1;
        for (int i = 1; i < A.length; ++i) {
            if (A[i] > end) {
                end = B[i];
                ++count;
            }
        }
        return count;
    }
}
