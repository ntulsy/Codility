package main;

import java.util.Stack;

/**
 * Created by Boss on 15/10/15.
 */
public class Brackets {
    public int solution(String S) {
        // write your code in Java SE 8
        Stack pending = new Stack();
        for(char c: S.toCharArray()){
            if(c=='{' || c=='[' || c=='(')
                pending.push(c);
            else if (!pending.isEmpty()) {
                if (c == '}'){
                    if((Character)pending.peek() == '{'){
                        pending.pop();
                    }else
                        return 0;
                }else if (c == ']'){
                    if((Character)pending.peek() == '[')
                        pending.pop();
                    else
                        return 0;
                }else if (c == ')'){
                    if((Character)pending.peek() == '(')
                        pending.pop();
                    else
                        return 0;
                }else
                    return 0;
            }else
                return 0;
        }

        return pending.empty()? 1:0;
    }
}
