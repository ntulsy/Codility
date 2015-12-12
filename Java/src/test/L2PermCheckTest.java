package test;

import main.L2PermCheck;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L2PermCheckTest {
    @Test
    public void testSolution() throws Exception{
        L2PermCheck t = new L2PermCheck();
        int[] A = {4,1,3,2};
        int result = t.solution(A);
        assertEquals(1,result);
    }
    @Test
    public void testSolution2() throws Exception{
        L2PermCheck t = new L2PermCheck();
        int[] A = {4,1,3};
        int result = t.solution(A);
        assertEquals(0,result);
    }

}