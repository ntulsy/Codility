package main;

import java.util.HashMap;

/**
 * Created by Boss on 18/10/15.
 */
public class Q3 {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int result = 0;
        HashMap<Integer, Integer> found = new HashMap<>();
        for(int a:A){
            if(found.containsKey(a))
                found.replace(a, found.get(a)+1);
            else
                found.put(a,1);
        }
        for(int b:found.values()){
            if(b>1){
                result+= b*(b-1)/2;
            }
        }
        return result;
    }
}
