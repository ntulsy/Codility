package codility;

/**
 * Created by Boss on 5/10/15.
 */
public class L05CountDiv {
    public int solution(int A, int B, int K){
        if(A % K == 0)
            return (B-A)/K +1;
        else if (B<(A/K+1)*K)
            return 0;
        else
            return (B- (A/K +1)*K)/K +1;

    }
}
