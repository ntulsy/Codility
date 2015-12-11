package main;

import java.util.Arrays;

/**
 * Created by Boss on 14/10/15.
 */
public class Lesson4Triangle {
    class Solution {
        public int solution(int[] A) {
            // write your code in Java SE 8
            Arrays.sort(A);
            boolean result = false;
            for(int i=0; i<A.length-2; i++){
                if (checkTriangle(A[i], A[i+1],A[i+2]))
                    return 1;
            }
            return 0;
        }

        public boolean checkTriangle(long a, long b, long c){
            if (a+b>c)
                return true;
            else
                return false;
        }
    }
}
