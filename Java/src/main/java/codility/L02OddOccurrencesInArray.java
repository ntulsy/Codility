package main.java.codility;

public class L02OddOccurrencesInArray {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int candidate = A[0];
        for (int i = 1; i < A.length; ++i)
            candidate ^= A[i];
        return candidate;
    }
}
