package codility;

import java.util.stream.IntStream;

/**
 * Created by Boss on 10/12/15.
 */
public class Sieve {
    public static int Sieve(int n){
        boolean[] sieve = new boolean[n+1];
        IntStream.range(2, n+1).forEach(
                a -> {
                    sieve[a] = true;
                }
        );
        sieve[0] = sieve[1] = false;
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

        int count = 0;
        for(boolean b:sieve){
            if(b){
                count++;
            }

        }
        return count;
    }
    public static void main(String[] args){
        System.out.println(Sieve(17));
    }
}
