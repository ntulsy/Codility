package main;

import java.util.Stack;

/**
 * Created by Boss on 15/10/15.
 */
public class Lesson5Fish {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        Stack fighting = new Stack();
        int living = B.length;
        for(int i=0;i<B.length;i++){
            if(B[i] == 1){
                fighting.push(A[i]);
            }else{
                while(!fighting.empty()){
                    if((Integer)fighting.peek()>A[i]){
                        living--;
                        break;
                    }else {
                        living--;
                        fighting.pop();
                    }
                }
            }
        }
        return living;
    }
}
