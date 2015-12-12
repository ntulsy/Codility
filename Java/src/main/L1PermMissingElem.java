package main;

/**
 * Created by Boss on 5/10/15.
 */
public class L1PermMissingElem {
    public int solution(int[] A){
        int[] check = new int[A.length+1];
        int i;
        for (i=0;i<A.length;i++){
            check[A[i]-1] = 1;
        }

        for (i=0; i<check.length;i++){
            if (check[i] == 0)
                return i+1;
        }
        return -1;
    }

    public int solution2(int[] A){
        int missing = A.length+1;
        int i;
//        use XOR bitwise operator for 1 -- N+1 and all elements in A[] (n XOR n == 0)
        for (i=0;i<A.length;i++){
            missing = missing ^ (i+1) ^ A[i];
        }
        return missing;
    }
}
