package codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L7StoneWallTest {
    @Test
     public void testSolution() throws Exception{
        L7StoneWall t = new L7StoneWall();
        int[] a = {8,8,5,7,9,8,7,4,8};
        int result = t.solution2(a);
        assertEquals(7,result);
    }
    @Test
    public void testSolution2() throws Exception{
        L7StoneWall t = new L7StoneWall();
        int[] a = {8,8};
        int result = t.solution2(a);
        assertEquals(1,result);
    }
    @Test
    public void testSolution3() throws Exception{
        L7StoneWall t = new L7StoneWall();
        int[] a = {3,5,7,9,7,9,5,4};
        int result = t.solution2(a);
        assertEquals(6,result);
    }
    @Test
    public void testSolution4() throws Exception{
        L7StoneWall t = new L7StoneWall();
        int[] a = {1};
        int result = t.solution2(a);
        assertEquals(1,result);
    }
}