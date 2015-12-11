package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by Boss on 15/10/15.
 */
public class Lesson5Brackets {
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

    public int solution2(String s){
        Stack pending = new Stack();
        Map<Character,Character> mapping = new HashMap<Character, Character>();
        mapping.put('}','{');
        mapping.put(']','[');
        mapping.put(')','(');
        for(char c: s.toCharArray()){
            if(c=='{' || c=='[' || c=='(')
                pending.push(c);
            else if (!pending.isEmpty() && pending.peek() == mapping.get(c))
                pending.pop();
            else
                return 0;
        }
        return pending.empty()? 1:0;
    }
}
