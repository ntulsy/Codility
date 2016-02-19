package codility;

import java.util.HashSet;

/**
 * Created by Boss on 17/12/15.
 */
public class L15AbsDistinct {
    public int solution(int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> set = new HashSet<>();
        for (int a : A)
            set.add(Math.abs(a));
        return set.size();
    }
}
