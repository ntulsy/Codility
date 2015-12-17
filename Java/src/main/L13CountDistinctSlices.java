package main;

import java.util.HashSet;

/**
 * Created by Boss on 17/12/15.
 */
public class L13CountDistinctSlices {
    public int solution(int M, int[] A) {
        // write your code in Java SE 8
        int front = 0;
        long count = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int back = 0; front < A.length && back < A.length;) {
            while (front < A.length && !set.contains(A[front])) {
                set.add(A[front++]);
                count += set.size();
            }
            while (front < A.length && back < A.length && set.contains(A[front])) {
                    set.remove(A[back++]);
            }
        }
        return (int)Math.min(count,1000000000);
    }
}
