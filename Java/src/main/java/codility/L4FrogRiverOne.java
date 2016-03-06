package codility;

/**
 * Created by Boss on 5/10/15.
 */
public class L4FrogRiverOne {
    public int solution(int X, int[] A){
        int[] check = new int[X];
        int i, sum = 0;
        for(i=0; i<A.length; i++){
            if (check[A[i]-1] == 0){
                check[A[i]-1] = 1;
                if (++sum == X)
                    return i;
            }
        }
        return -1;
    }
}
