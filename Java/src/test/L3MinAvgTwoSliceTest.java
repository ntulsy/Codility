package test;

import main.L3MinAvgTwoSlice;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L3MinAvgTwoSliceTest {
    @Test
    public void testSolution() throws Exception{
        L3MinAvgTwoSlice t = new L3MinAvgTwoSlice();
        int[] A = {10000, -10000};
        int result = t.solution(A);
        assertEquals(0, result);
    }
}