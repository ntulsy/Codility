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
                long oneResult = (long) b * ((long)(b-1)) / 2L;
                if (oneResult > 1000000000L)
                    return 1000000000;
                result += (int) oneResult;
                if (result>= 1000000000)
                    return 1000000000;
            }
        }
        return result;
    }
}
