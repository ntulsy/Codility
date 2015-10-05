package test;

import main.PermCheck;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PermCheckTest {
    @Test
    public void testSolution() throws Exception{
        PermCheck t = new PermCheck();
        int[] A = {4,1,3,2};
        int result = t.solution(A);
        assertEquals(1,result);
    }
    @Test
    public void testSolution2() throws Exception{
        PermCheck t = new PermCheck();
        int[] A = {4,1,3};
        int result = t.solution(A);
        assertEquals(0,result);
    }

}