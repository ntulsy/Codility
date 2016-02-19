package codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L3TapeEquilibriumTest {

    @Test
    public void testSolution() throws Exception {
        L3TapeEquilibrium t = new L3TapeEquilibrium();
        int[] A = {1, 1, 1, 1, 1};
        int result = t.solution(A);
        assertEquals(1, result);
    }

    @Test
    public void testSolution2() throws Exception {
        L3TapeEquilibrium t = new L3TapeEquilibrium();
        int[] A = {-10, -5, -3, -4, -5};
        int result = t.solution(A);
        assertEquals(3, result);
    }

    @Test
    public void testSolution3() throws Exception {
        L3TapeEquilibrium t = new L3TapeEquilibrium();
        int[] A = {-10, -20, -30, -40, 100};
        int result = t.solution(A);
        assertEquals(20, result);
    }
    @Test
    public void testSolution4() throws Exception {
        L3TapeEquilibrium t = new L3TapeEquilibrium();
        int[] A = {-1000,1000};
        int result = t.solution(A);
        assertEquals(2000, result);
    }
}