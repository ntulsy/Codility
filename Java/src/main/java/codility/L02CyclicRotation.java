package main.java.codility;

/**
 * Created by Boss on 19/2/16.
 */
public class L02CyclicRotation {
    public int[] solution(int[] A, int K) {
        if (A.length <= 1)
            return A;
        int[] result = new int[A.length];
        int j = 0;
        int i;
        for (i = A.length - K % A.length; i < A.length; ++i )
            result[j++] = A[i];
        for (i = 0; i < A.length - K % A.length; ++i)
            result[j++] = A[i];
        return result;
    }
}
