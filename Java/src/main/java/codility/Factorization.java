package codility;

import java.util.ArrayList;

/**
 * Created by Boss on 10/12/15.
 */
public class Factorization {
    public static int[] arrayF(int n){
        int[] F = new int[n+1];
        int i = 2;
        while (i * i <= n){
            if (F[i] == 0){
                int k = i * i;
                while ( k <= n ){
                    if (F[k] == 0)
                        F[k] = i;
                    k += i;
                }
            }
            i++;
        }
        return F;
    }
    public static ArrayList<Integer> factorization(int n){
        int[] F = arrayF(n);
        ArrayList<Integer> factors = new ArrayList<>();
        while( F[n] > 0){
            factors.add(F[n]);
            n /= F[n];
        }
        factors.add(n);
        return factors;
    }

    public static void main(String[] args){
        ArrayList<Integer> test = factorization(20);
        for(int i: test)
            System.out.println(i);
    }
}
