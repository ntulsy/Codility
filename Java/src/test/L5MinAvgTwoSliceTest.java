package test;

import main.L5MinAvgTwoSlice;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L5MinAvgTwoSliceTest {
    @Test
    public void testSolution() throws Exception{
        L5MinAvgTwoSlice t = new L5MinAvgTwoSlice();
        int[] A = {10000, -10000};
        int result = t.solution(A);
        assertEquals(0, result);
    }
}