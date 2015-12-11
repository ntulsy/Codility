package main;

import java.util.ArrayList;

/**
 * Created by Boss on 9/12/15.
 */
public class Lesson8Flags {
    public int solution(int[] A) {
        // write your code in Java SE 8
        ArrayList<Integer> peaks = new ArrayList<>();
        for (int i = 1; i <= A.length - 2; i++) {
            if (A[i] > A[i - 1] && A[i] > A[i + 1])
                peaks.add(i);
        }
        int num = getFlag(1,peaks.size(), peaks, A.length);
        if (num == 1)
            return peaks.size()==0? 0:1;
        return num;
    }
    public int getFlag(int min, int max, ArrayList<Integer> peaks, int len){
        if (max-min == 1 || max==min){
            if(setTest(max, peaks, len))
                return max;
            else
                return min;
        }else {
            int mid = (min+max)/2;
            if (setTest(mid, peaks, len)) {
                min = mid;
            } else {
                max = mid - 1;
            }
            return getFlag(min, max, peaks, len);
        }
    }

    public boolean setTest(int num, ArrayList<Integer> peaks, int len){
        int count = 1;
        int current = peaks.get(0)+num;

        for (int j=1; j<peaks.size();j++){
            if(current<len && peaks.get(j)>=current){
                current = peaks.get(j)+current;
                count++;
            }
        }
        return (count==num);
    }
}
