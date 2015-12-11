package main;

import java.util.ArrayList;

/**
 * Created by Boss on 19/10/15.
 */
public class Lesson8Peaks {
    public int solution(int[] A) {
        // write your code in Java SE 8
        ArrayList<Integer> peaks = new ArrayList<>();
        for(int i=1; i<=A.length-2;i++){
            if(A[i]>A[i-1] && A[i]>A[i+1])
                peaks.add(i);
        }

        for(int i=peaks.size();i>0;i--){
            if(A.length%i == 0){
                if (blockTest(A.length/i, peaks, A.length))
                    return (i);
            }
        }
        return 0;
    }

    public boolean blockTest(int blockSize, ArrayList<Integer> peaks, int len){
        boolean[] check = new boolean[len/blockSize];
        int count=0;

        for(int p: peaks){
            int index=p/blockSize;
            if (!check[index]){
                check[index]=true;
                count++;
            }
        }

        return (count==len/blockSize);
    }
}
