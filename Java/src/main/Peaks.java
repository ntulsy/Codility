package main;

import java.util.Stack;

/**
 * Created by Boss on 19/10/15.
 */
public class Peaks {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Stack<Integer> peeks = new Stack<>();
        for(int i=1; i<=A.length-2;i++){
            if(A[i]>A[i-1] && A[i]>A[i+1])
                peeks.push(i);
        }
        System.out.println("no of peaks is "+peeks.size());

        int i = 2;
        Stack<Integer> pending = new Stack<>();
        while (i*i<=A.length){
            if(A.length%i ==0){
                pending.push(i);
                if(blockTest(i, peeks,A.length))
                    return (A.length/i);
            }
            i++;
        }
        while (!pending.empty()){
            int no = pending.pop();
            if(blockTest(A.length/no, peeks, A.length))
                return (no);
        }
        return peeks.empty()? 0:1;
    }

    public boolean blockTest(int blockSize, Stack<Integer> peeks,int length){
        int tmp = 0;
        if(peeks.empty())
            return false;

        for(int p: peeks){
            tmp += blockSize;
            if(p>=tmp)
                return false;
        }
        return true;
    }
}
