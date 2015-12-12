package main;

/**
 * Created by Boss on 5/10/15.
 */
public class L3MinAvgTwoSlice {
    public int solution(int[] A){
        int min_index = 0;
        double min_value = Integer.MAX_VALUE;
        int i;
        for (i = 0; i<A.length-1;i++){
            if ((double)(A[i]+A[i+1])/2 < min_value){
                min_value= ((double)A[i]+A[i+1])/2;
                min_index = i;
            }
            if ((i+2)<A.length) {
                if ((double)(A[i] + A[i + 1] + A[i + 2]) / 3 < min_value) {
                    min_value = ((double) A[i] + A[i + 1] + A[i + 2]) / 3;
                    min_index = i;
                }
            }
        }
        return min_index;
    }
}
