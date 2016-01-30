package codility;

/**
 * Created by Boss on 19/10/15.
 */
public class PrimalityCheck {
    public boolean solution(int n){
        int i=2;
        while(i*i<=n){
            if(n%i == 0)
                return false;
            i++;
        }
        return true;
    }

}
