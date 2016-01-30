package main;

/**
 * Created by Boss on 12/12/15.
 */
public class L13Ladder {
    public int[] solution(int[] A, int[] B) {
        // write your code in Java SE 8
        int l = A.length;
        int[] result = new int[l];

        int[] ways = new int[l+1];
        ways[0] = 1;
        ways[1] = 1;
        for (int j = 2; j <= l; ++j) {
            ways[j] = ways[j-1] + ways[j-2];
        }

        for (int i = 0; i < A.length; ++i) {
            int a = ways[A[i]];
            int b = B[i];
//            result[i] = a & ((1 << b) - 1);
            result[i] = a & (-1 >>> (32-b));
        }
        return result;
    }
}
