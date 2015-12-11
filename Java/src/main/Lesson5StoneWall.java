package main;

import java.util.Stack;

/**
 * Created by Boss on 15/10/15.
 */
public class Lesson5StoneWall {
    public int solution(int[] H) {
        // write your code in Java SE 8
        int combination = 0;
        Stack pending = new Stack();
        for(int a:H) {
            if (!pending.empty()) {
                if (a > (Integer) pending.peek()) {
                    pending.push(a);
                } else if (a < (Integer) pending.peek()) {
                    while (!pending.empty()&& a < (Integer) pending.peek())
                        pending.pop();
                    if (!pending.empty() && a == (Integer) pending.peek())
                        combination++;
                    pending.push(a);
                } else {
                    combination++;
                }
            }else
                pending.push(a);
        }
        return H.length-combination;
    }
    public int solution2(int[] H){
        int block = 0;
        Stack pending = new Stack();
        for(int a:H){
            while(!pending.isEmpty()&& a<(Integer)pending.peek())
                pending.pop();
            if(!pending.isEmpty() && a == (Integer)pending.peek()){

            }
            else {
                block++;
                pending.push(a);
            }
        }
        return block;
    }
}
