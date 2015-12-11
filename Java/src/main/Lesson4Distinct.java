package main;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Boss on 14/10/15.
 */
public class Lesson4Distinct {
    class Solution {
        public int solution(int[] A) {
            // write your code in Java SE 8
            Arrays.sort(A);
            int result = 0;
            int tmp = Integer.MAX_VALUE;
            for(int i=0;i<A.length;i++){
                if (tmp != A[i]){
                    result++;
                    tmp = A[i];
                }
            }
            return result;
        }
        public int solution2(int[] A){
            HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
            for(int i:A){
                map.put(i,true);
            }
            return map.size();
        }
    }
}
