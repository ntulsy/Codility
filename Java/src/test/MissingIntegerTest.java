package test;

import main.MissingInteger;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MissingIntegerTest {
    @Test
    public void testSolution() throws Exception{
        MissingInteger t = new MissingInteger();
        int[]A = {1,3,6,4,1,2};
        int result = t.solution2(A);
        assertEquals(5,result);
    }
    @Test
    public void testSolution2() throws Exception{
        MissingInteger t = new MissingInteger();
        int[]A = {1,3,5,4,1,2};
        int result = t.solution2(A);
        assertEquals(6,result);
    }
    @Test
    public void testSolution3() throws Exception{
        MissingInteger t = new MissingInteger();
        int[]A = {4, 5, 6, 2};
        int result = t.solution2(A);
        assertEquals(1,result);
    }

}