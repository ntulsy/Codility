package codility;

/**
 * Created by Boss on 5/10/15.
 */
public class L5PassingCars {
    public int solution(int[] A){
        int result = 0, i, eastCars=0;
        for (i = 0; i<A.length;i++){
            if (A[i]==0) {
                eastCars++;
            }
            else{
                result+=eastCars;
                if (result>1000000000)
                    return -1;
            }
        }

        return result;
    }
    public int solution2(int[] A){
        int result = 0, i, westCars = 0;
        for(i=A.length-1; i>=0; i--){
            if (A[i]==1)
                westCars++;
            else{
                result+=westCars;
                if (result>1000000000)
                    return -1;
            }
        }
        return result;
    }
}
