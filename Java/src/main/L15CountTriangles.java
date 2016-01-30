package main;

import java.util.Arrays;

/**
 * Created by Boss on 17/12/15.
 */
public class L15CountTriangles {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int count = 0;
        for (int x = 0; x < A.length - 2; ++x) {
            int z = x + 2;
            for (int y = x + 1; y < A.length - 1; ++y) {
                while (z < A.length && A[x] + A[y] > A[z])
                    ++z;
                count += z - 1 - y;
            }
        }
        return count;
    }
}
