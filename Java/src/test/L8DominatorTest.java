package test;

import main.L8Dominator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L8DominatorTest {
    @Test
    public void testSolution() throws Exception{
        L8Dominator t = new L8Dominator();
        int[] A = {2, 1, 1, 3, 4};
        int result = t.solution(A);
        assertEquals(-1, result);
    }
    @Test
    public void testSolution2() throws Exception{
        L8Dominator t = new L8Dominator();
        int[] A = {1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2};
        int result = t.solution(A);
        assertEquals(-1, result);
    }

}