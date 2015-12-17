package main;

/**
 * Created by Boss on 16/12/15.
 */
public class BinarySearch {
    public int BinarySearch(int[] A, int k) {
        int beg = 1;
        int end = A.length;
        int result = -1;
        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (check(A, mid) <= k){
                end = mid - 1;
                result = mid;
            }
            else
                beg = mid + 1;
        }
        return result;
    }

    public int check(int[] A, int size) {
        int count = 0;
        int last = -1;
        for(int i = 0; i < A.length; ++i) {
            if (A[i] == 1 && last < i) {
                ++count;
                last = i + size - 1;
            }
        }
        return count;
    }
}
