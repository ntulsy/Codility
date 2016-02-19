package codility;

/**
 * Created by Boss on 17/10/15.
 */
public class L9MaxDoubleSliceSum {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int max_slice = 0;
        int max_sofar = 0, max_sofar_minusY = 0;
        int max = Integer.MIN_VALUE;
        int y = Integer.MAX_VALUE;


        for (int i = 1; i < A.length - 1; i++) {
            max_sofar = max_sofar + A[i];
            y = Math.min(y, A[i]);
            max_sofar_minusY = max_sofar - y;

            if (max_sofar_minusY <= 0) {
                max_sofar = A[i];
                max_sofar_minusY = 0;
                y = A[i];
            }
            max_slice = Math.max(max_slice, max_sofar_minusY);
        }
        return max_slice;
    }
    public int solution2(int[] A){
        int[] ending_here = new int[A.length];
        int[] starting_here = new int[A.length];
        int max_slice =0;
        for(int i=1;i<A.length-1; i++){
            ending_here[i]=Math.max(0, ending_here[i-1]+A[i]);
        }
        for(int j=A.length-2;j>=1;j--){
            starting_here[j] = Math.max(0, starting_here[j+1]+A[j]);
        }
        for(int k=1;k<A.length-1;k++)
            max_slice = Math.max(max_slice,ending_here[k-1]+starting_here[k+1]);
        return max_slice;
    }
}
