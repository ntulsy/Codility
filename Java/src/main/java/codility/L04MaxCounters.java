package codility;

/**
 * Created by Boss on 5/10/15.
 */
public class L04MaxCounters {
    public int[] solution(int N,int[]A){
        int[] result = new int[N];
        int i, lastMax=0, max=0;
        for(i=0;i<A.length;i++){
            if(A[i]<=N) {
                result[A[i]-1] = Math.max(result[A[i]-1],lastMax);
                if((++result[A[i] - 1])>max)
                    max = result[A[i]-1];
            }
            else{
                lastMax= max;
            }
        }
        for(i=0;i<N;i++){
            if (result[i]<lastMax)
                result[i]=lastMax;
        }
        return result;
    }
}
