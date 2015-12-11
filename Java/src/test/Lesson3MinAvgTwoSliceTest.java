package test;

import main.Lesson3MinAvgTwoSlice;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Lesson3MinAvgTwoSliceTest {
    @Test
    public void testSolution() throws Exception{
        Lesson3MinAvgTwoSlice t = new Lesson3MinAvgTwoSlice();
        int[] A = {10000, -10000};
        int result = t.solution(A);
        assertEquals(0, result);
    }
}