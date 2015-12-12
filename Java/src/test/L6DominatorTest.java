package test;

import main.L6Dominator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L6DominatorTest {
    @Test
    public void testSolution() throws Exception{
        L6Dominator t = new L6Dominator();
        int[] A = {2, 1, 1, 3, 4};
        int result = t.solution(A);
        assertEquals(-1, result);
    }
    @Test
    public void testSolution2() throws Exception{
        L6Dominator t = new L6Dominator();
        int[] A = {1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2};
        int result = t.solution(A);
        assertEquals(-1, result);
    }

}