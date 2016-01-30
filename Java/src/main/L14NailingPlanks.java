package main;

import java.util.Arrays;

/**
 * Created by Boss on 16/12/15.
 */
public class L14NailingPlanks {
    public int solution(int[] A, int[] B, int[] C) {
        // write your code in Java SE 8
        Nail[] nails = new Nail[C.length];
        for (int i = 0; i < C.length; ++i) {
            nails[i] = new Nail(i, C[i]);
        }
        Arrays.sort(nails);

        int result = -1;
        for(int j = 0; j < A.length; ++j) {
            result= BinarySearch(A[j], B[j], nails, result);
            if (result == -1)
                return -1;
        }
        return result+1;

    }

    public int BinarySearch(int low, int high, Nail[] nails, int preMin) {
        int beg = 0;
        int end = nails.length-1;
        int result = -1;
        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (nails[mid].pos > high){
                end = mid - 1;
            }
            else if (nails[mid].pos < low)
                beg = mid + 1;
            else {
                end = mid - 1;
                result = mid;
            }
        }

        if (result == -1)
            return -1;

        int potential = nails[result].index;
        while (result < nails.length && nails[result].pos <= high) {
            if (nails[result].index < potential)
                potential = nails[result].index;
            if (potential <= preMin)
                return preMin;
            ++result;
        }
        return potential;
    }

    public class Nail implements Comparable<Nail>{
        private int index;
        private int pos;
        Nail(int index, int pos){
            super();
            this.index = index;
            this.pos = pos;
        }
        @Override
        public int compareTo(Nail nail) {
            return Integer.compare(this.pos, nail.pos);
        }
    }
}
