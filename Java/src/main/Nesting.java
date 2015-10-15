package main;

import java.util.Stack;

/**
 * Created by Boss on 15/10/15.
 */
public class Nesting {
    public int solution(String S) {
        // write your code in Java SE 8
        char[] string = S.toCharArray();
        Stack pending = new Stack();
        for(char c: string){
            if (c == '('){
                pending.push(c);
            }else if(c == ')'&& !pending.empty()){
                pending.pop();
            }else{
                return 0;
            }
        }
        return pending.empty()? 1:0;
    }
}
