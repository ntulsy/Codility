package codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L4PermCheckTest {
    @Test
    public void testSolution() throws Exception{
        L4PermCheck t = new L4PermCheck();
        int[] A = {4,1,3,2};
        int result = t.solution(A);
        assertEquals(1,result);
    }
    @Test
    public void testSolution2() throws Exception{
        L4PermCheck t = new L4PermCheck();
        int[] A = {4,1,3};
        int result = t.solution(A);
        assertEquals(0,result);
    }

}