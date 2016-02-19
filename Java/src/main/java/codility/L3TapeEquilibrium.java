package codility;

/**
 * Created by Boss on 4/10/15.
 */

public class L3TapeEquilibrium {
    public int solution(int[] A){
        int[] sum = new int[A.length];
        sum[0]= A[0];
        int i,solution = Integer.MAX_VALUE;
        for (i=1; i<A.length; i++){
            sum[i]=sum[i-1]+A[i];
        }
        for (i=0;i<(A.length-1);i++){
            solution = Math.min(solution,Math.abs(sum[A.length-1]-2*sum[i]));
        }
        return solution;
    }
}
