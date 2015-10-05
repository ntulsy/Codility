package test;

import main.MaxCounters;
import org.junit.Test;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MaxCountersTest {
    @Test
    public void testSolution() throws Exception{
        MaxCounters t = new MaxCounters();
        int[] A = {3,4,4,6,1,4,4};
        int N = 5;
        int[] result = t.solution(N,A);
        int[] expected = {3,2,2,4,2};
        assertEquals(Arrays.equals(expected,result),true);
    }
}