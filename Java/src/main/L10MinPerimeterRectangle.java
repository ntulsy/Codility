package main;

/**
 * Created by Boss on 19/10/15.
 */
public class L10MinPerimeterRectangle {
    public int solution(int N) {
        // write your code in Java SE 8
        int a=-1,b=-1,i=1;
        while (i*i<=N){
            if(N%i == 0){
                a = i;
                b = N/i;
            }
            i++;
        }
        return 2*(a+b);
    }
}
