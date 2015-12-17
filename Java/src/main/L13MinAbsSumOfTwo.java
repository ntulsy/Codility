package main;

import java.util.Arrays;

/**
 * Created by Boss on 17/12/15.
 */
public class L13MinAbsSumOfTwo {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int back = 0;
        int front = A.length - 1;
        int min = Integer.MAX_VALUE;
        while (back <= front) {
            int tmp = A[back] + A[front];
            min = Math.min(min, Math.abs(tmp));

            if (tmp > 0)
                --front;
            else if (tmp < 0)
                ++back;
            else
                return 0;
        }
        return min;
    }
}
