package main;

import java.util.ArrayList;

/**
 * Created by Boss on 9/12/15.
 */
public class L8Flags {
    public int solution(int[] A) {
        // write your code in Java SE 8
        ArrayList<Integer> peaks = new ArrayList<>();
        int n = A.length;
        for (int i = 1; i <= n - 2; i++) {
            if (A[i] > A[i - 1] && A[i] > A[i + 1])
                peaks.add(i);
        }
        if (peaks.size() == 0)
            return 0;
        int[] peak = peaks.stream().mapToInt(i -> i).toArray();
        int max = Math.min(peak.length, (int)Math.sqrt(n)+1);
        int i = max; int result = 1;
        while ( i > 1){
            if (setTest(i, peak, n)){
                result = i;
                break;
            }
            i--;
        }
        return result;
    }
    public boolean setTest(int num, int[] peaks, int len){
        int count = 1;
        int current = peaks[0]+num;

        for (int j = 1; j < peaks.length && count < num ;j++){
            if(current < len && peaks[j] >= current){
                current = peaks[j]+num;
                count++;
            }
        }
        return (count==num);
    }

    public int goldenSolution(int[] A) {
        // write your code in Java SE 8
        boolean[] peaks = new boolean[A.length];
        int n = A.length; int np = 0;
        for (int i = 1; i <= n - 2; i++) {
            if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
                peaks[i] = true;
                np++;
            }
        }
        if (np == 0)
            return 0;

        int[] next = next(A, peaks);
        int max = Math.min(np, (int)Math.sqrt(n)+1);
        int i = 1; int result = 0;
        while ( i <= max){
            int count = 0; int pos = 0;
            while (pos < n && count < i){
                pos = next[pos];
                if (pos == -1)
                    break;
                pos = pos + i;
                count++;
            }
            result = Math.max(result, count);
            i++;
        }
        return result;
    }

    public int[] next(int[] A, boolean[] peaks){
        int n = A.length;
        int[] next = new int[n];
        int i = n - 1; next[i] = -1; i--;
        while (i >= 0){
            if (peaks[i])
                next[i] = i;
            else
                next[i] = next[i + 1];
            i--;
        }
        return next;
    }
}
