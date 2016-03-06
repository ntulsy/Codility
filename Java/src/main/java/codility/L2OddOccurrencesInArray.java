package main.java.codility;

import java.util.HashSet;

/**
 * Created by Boss on 19/2/16.
 */
public class L2OddOccurrencesInArray {
    public int solution(int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> unpaird = new HashSet<>();
        for (int a : A) {
            if (!unpaird.add(a))
                unpaird.remove(a);
        }
        return (int)unpaird.toArray()[0];
    }
}
