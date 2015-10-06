package test;

import main.MinAvgTwoSlice;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinAvgTwoSliceTest {
    @Test
    public void testSolution() throws Exception{
        MinAvgTwoSlice t = new MinAvgTwoSlice();
        int[] A = {10000, -10000};
        int result = t.solution(A);
        assertEquals(0, result);
    }
}