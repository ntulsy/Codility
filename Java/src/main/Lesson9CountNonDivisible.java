package main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Boss on 11/12/15.
 */
public class Lesson9CountNonDivisible {
    public int[] solution3(int[] A) {
        int n = A.length;
        int[] reps = new int[n * 2 + 1];
        int[] noFactors = new int[n * 2 + 1];
        for (int a : A)
            reps[a]++;

        int i = 1;
        while (i <= 2 * n){
            if (reps[i] > 0) {
                int tmp = i;
                while (tmp <= 2 * n) {
                    if (reps[tmp] > 0)
                        noFactors[tmp] += reps[i];
                    tmp += i;
                }
            }
            i++;
        }

        int[] result = new int[n];
        for (int j = 0; j < n; j++){
            result[j] = n - noFactors[A[j]];
        }
        return result;

    }
    public int[] solution2(int[] A) {
        // write your code in Java SE 8
        HashMap<Integer, Integer> reps = new HashMap<>();
        for ( int i: A){
            if (reps.containsKey(i))
                reps.replace(i, reps.get(i)+1);
            else
                reps.put(i, 1);
        }

        HashMap<Integer, HashSet<Integer>> factors = new HashMap<>();
        int max = 0;
        for(int a: A) {
            factors.put(a,new HashSet<Integer>(){{add(1); add(a);}});
            if (a > max)
                max = a;
        }

        int i = 2;
        while (i * i <= max){
            int tmp = i * 2 ;
            while (tmp <= max) {
                if (factors.containsKey(tmp) && !factors.get(tmp).contains(i)) {
                    factors.get(tmp).add(i);
                    factors.get(tmp).add(tmp / i);
                }
                tmp += i;
            }
            i++;
        }

        int[] result = new int[A.length];
        for (int k = 0; k < A.length; k++){
            int divisible = factors.get(A[k]).stream().mapToInt(j -> reps.getOrDefault(j, 0)).sum();
            result[k] = A.length - divisible;
        }
        return result;
    }



    public int[] solution(int[] A) {
        // write your code in Java SE 8
        int[] B = A.clone();
        Arrays.sort(B);
        HashMap<Integer, Integer[]> factors = divide(B);
        HashMap<Integer, Integer> reps = new HashMap<>();
        int current = 0; int count = 0;
        for ( int i: B){
            if (i == current){
                count++;
            }else {
                reps.put(current, count);
                current = i;
                count = 1;
            }
        }
        reps.put(current, count);
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++){
            int divisible = 0;
            Integer[] factor = factors.get(A[i]);
            for (int f:factor){
                if (reps.containsKey(f))
                    divisible += reps.get(f);
            }

            result[i] = A.length - divisible;
        }
        return result;
    }

    public HashMap<Integer, Integer[]> divide(int[] B) {
        boolean has1 = false; if (B[0] == 1) has1 = true;

        int n = B[B.length-1];
        int[] F = arrayF(n);
        HashMap<Integer, Integer[]> factors = new HashMap<>();
        for (int i : B){
            if (!factors.containsKey(i)){
                Set<Integer> factorB = new HashSet<>();
                if (has1)
                    factorB.add(1);
                if ( F[i] > 0){
                    for (int b : B){
                        if (b < F[i])
                            continue;
                        if (i % b == 0){
                            factorB.add(b);
                            if (factors.containsKey(i/b))
                                factorB.add(i/b);
                        }
                    }
                }
                factorB.add(i);
                factors.put(i, factorB.toArray(new Integer[factorB.size()]));
            }
        }
        return factors;
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
