package main;

import java.util.Stack;
import java.util.HashMap;
import java.util.Map;
/**
 * Created by Boss on 18/10/15.
 */
public class Q2 {
    public String solution(String S) {
        // write your code in Java SE 8
        Stack<Character> pending = new Stack<Character>();
        String result = "";
        Map<Character,Character> mapping = new HashMap<Character, Character>();
        mapping.put('A','C');
        mapping.put('C','A');
        mapping.put('B','B');
        for(char c: S.toCharArray()){
            if(pending.empty())
                pending.push(c);
            else {
                if(pending.peek() != 'B'){
                    if(!mapping.containsKey(c))
                        return S;
                    if(pending.peek() == mapping.get(c))
                        pending.push(c);
                }else {
                    if(c == 'B')
                        pending.push(c);
                    else{
                        while (!pending.empty() && pending.peek()=='B')
                            pending.pop();
                        pending.push(c);
                    }
                }
            }
        }

        for(char d: pending){
            result = result+d;
        }
        return result;
    }
}
