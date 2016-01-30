package codility;

import java.util.stream.IntStream;

/**
 * Created by Boss on 10/12/15.
 */
public class L11CountSemiprimes {
    public int[] solution(int N, int[] P, int[] Q) {
        // write your code in Java SE 8
        boolean[] isSP = getSP2(N);
        int[] countSP = new int[N + 1];
        int current = 0;
        for (int i = 1; i <= N; i++){
            if (isSP[i])
                current++;
            countSP[i] = current;
        }
        int[] result = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            result[i] = countSP[Q[i]] - countSP[P[i]-1];
        }
        return result;
    }

    public boolean[] getSP(int n) {
        int[] F = arrayF(n);
        boolean[] isSP = new boolean[n+1];
        for (int i = 2; i <= n; i++) {
            if (F[i] > 0 && F[i/F[i]] == 0)
                isSP[i] = true;
        }
        return isSP;
    }

    public boolean[] getSP2(int n) {
        boolean[] sieve = sieve(n);
        boolean[] isSP = new boolean[n+1];
        int i = 2;
        while ( i * i <= n) {
            if (sieve[i]) {
                int k = i * i;
                while ( k <= n){
                    if (sieve[k/i])
                        isSP[k] = true;
                    k += i;
                }
            }
            i++;
        }
        return  isSP;
    }

    public boolean[] sieve(int n){
        boolean[] sieve = new boolean[n+1];
        IntStream.range(2, n + 1).forEach(
                a -> {
                    sieve[a] = true;
                }
        );
        int i = 2;
        while(i * i <= n){
            if (sieve[i]) {
                int k = i * i;
                while (k <= n) {
                    sieve[k] = false;
                    k += i;
                }
            }
            i++;
        }
        return sieve;
    }

    public int[] arrayF(int n) {
        int[] F = new int[n + 1];
        int i = 2;
        while (i * i <= n) {
            if (F[i] == 0) {
                int k = i * i;
                while (k <= n) {
                    if (F[k] == 0)
                        F[k] = i;
                    k += i;
                }
            }
            i++;
        }
        return F;
    }

}
