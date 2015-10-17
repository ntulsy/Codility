package test;

import main.Dominator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DominatorTest {
    @Test
    public void testSolution() throws Exception{
        Dominator t = new Dominator();
        int[] A = {2, 1, 1, 3, 4};
        int result = t.solution(A);
        assertEquals(-1, result);
    }
    @Test
    public void testSolution2() throws Exception{
        Dominator t = new Dominator();
        int[] A = {1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2};
        int result = t.solution(A);
        assertEquals(-1, result);
    }

}