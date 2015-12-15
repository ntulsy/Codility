package main;

/**
 * Created by Boss on 12/12/15.
 */
public class L11FibFrog {
    public int solution(int[] A) {
        // write your code in Java SE 8

        int n = 26;
        int[] fib = new int[n+1];
        fib[1] = 1;
        fib[2] = 1;
        for (int i = 3; i <= n; ++i)
            fib[i] = fib[i - 1] + fib[i - 2];

        int target = A.length + 1;
        int[] best = new int[A.length];
        int j;
        for (j = 2; fib[j] < target; ++j) {
            int OneStep = fib[j];
            if (A[OneStep-1] == 1)
                best[OneStep-1] = 1;
        }
        if (fib[j] == target)
            return 1;

        for (int k = 1; k< target; ++k){
            if (best[k-1] > 0 || A[k-1] == 0)
                continue;

            int min = 100000;
            for (int a = 2; fib[a] < k; ++a) {
                int choice = k - fib[a];

                if (best[choice - 1] > 0 && best[choice - 1] < min - 1)
                    min = best[choice - 1] + 1;
            }
            best[k - 1] = min;
        }

        int min = 100000;
        for (int a = 2; fib[a] < target; ++a) {
            int choice = target - fib[a];

            if (best[choice - 1] > 0 && best[choice - 1] < min - 1)
                min = best[choice - 1] + 1;
        }
        return min == 100000? -1 : min;
    }
}
