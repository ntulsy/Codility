package main;

/**
 * Created by Boss on 17/12/15.
 */
public class Caterpillar {
    public boolean CaterpillarMethod(int[] A, int s) {
        int n = A.length;
        int front = 0;
        int sum = 0;
        for (int back = 0; front < n && back < n; ++back) {
            while (front < n && A[front] + sum <= s) {
                sum += A[front];
                ++front;
            }
            if (sum == s)
                return true;

            sum -= A[back];
        }
        return false;
    }

    public int Triangles(int[] A) {
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
