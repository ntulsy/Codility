package codility;

/**
 * Created by Boss on 16/10/15.
 */
public class L08Dominator {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int value = 0, size = 0;
        for(int a:A){
            if(size == 0){
                size++;
                value=a;
            }else{
                if(a==value)
                    size++;
                else
                    size--;
            }
        }
        if(size<=0)
            return -1;
        int count = 0;
        int position = -1;
        for(int i = 0; i<A.length;i++){
            if(A[i] == value) {
                position = i;
                count++;
            }
        }
        if(count> A.length/(float)2)
            return position;
        else
            return -1;
    }
}
