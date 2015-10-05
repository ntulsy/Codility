package main;

/**
 * Created by Boss on 5/10/15.
 */
public class PermCheck {
    public int solution(int[] A){
        boolean[] check = new boolean[A.length];
        int i;
        for (i =0; i<A.length; i++){
            if (A[i] > A.length || A[i]<1)
                return 0;

            if (check[A[i]-1])
                return 0;
            else
                check[A[i]-1] = true;
        }
        return 1;
    }
}
