package main;

/**
 * Created by Boss on 16/10/15.
 */
public class EquiLeader {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int size = 0, value = -1;
        for(int a:A){
            if(size == 0){
                size++;
                value = a;
            }else{
                if(a == value)
                    size++;
                else
                    size--;
            }
        }
        if(size<=0)
            return 0;

        int count = 0;
        for(int b:A){
            if (b == value){
                count++;}}

        int result=0;
        if(count>(float)A.length/2){
            int[] position = new int[count];
            int sofar = 0;
            for(int i = 0; i<A.length;i++){
                if(A[i] == value){
                    position[sofar] = i;
                    sofar++;
                }
                if((sofar*2)>(i+1) && 2*(count-sofar)>(A.length-i-1)) {
                    result++;
                }
            }
        }
        return result;
    }

}
