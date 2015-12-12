package main;

import java.util.Arrays;

/**
 * Created by Boss on 11/10/15.
 */
public class L4MaxProductOfThree {
    class Solution {
        public int solution(int[] A) {
            // write your code in Java SE 8
//            3 positive: 3 max positive
//            2 positive & 1 negative: 2 min positive & 1 max negative
//            1 positive & 2 negative: 1 max positive & 2 min negative
//            3 negative: 3 max negative
            Arrays.sort(A);
            return Math.max(A[0]*A[1]*A[A.length-1], A[A.length-1]*A[A.length-2]*A[A.length-3]);

        }
    }
}
