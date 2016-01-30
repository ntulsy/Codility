package codility;

/**
 * Created by Boss on 19/10/15.
 */
public class L10CountFactors {
    public int solution(int N) {
        // write your code in Java SE 8
        int i = 1, result = 0;
        while(i*i<N){
            if(N%i == 0)
                result+=2;
            i++;
        }
        if(i*i==N)
            result++;
        return result;
    }
}
