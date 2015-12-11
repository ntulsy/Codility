package test;

import main.Lesson2MaxCounters;
import org.junit.Test;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Lesson2MaxCountersTest {
    @Test
    public void testSolution() throws Exception{
        Lesson2MaxCounters t = new Lesson2MaxCounters();
        int[] A = {3,4,4,6,1,4,4};
        int N = 5;
        int[] result = t.solution(N,A);
        int[] expected = {3,2,2,4,2};
        assertEquals(Arrays.equals(expected,result),true);
    }
}