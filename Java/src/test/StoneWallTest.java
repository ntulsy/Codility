package test;

import main.StoneWall;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StoneWallTest {
    @Test
     public void testSolution() throws Exception{
        StoneWall t = new StoneWall();
        int[] a = {8,8,5,7,9,8,7,4,8};
        int result = t.solution2(a);
        assertEquals(7,result);
    }
    @Test
    public void testSolution2() throws Exception{
        StoneWall t = new StoneWall();
        int[] a = {8,8};
        int result = t.solution2(a);
        assertEquals(1,result);
    }
    @Test
    public void testSolution3() throws Exception{
        StoneWall t = new StoneWall();
        int[] a = {3,5,7,9,7,9,5,4};
        int result = t.solution2(a);
        assertEquals(6,result);
    }
    @Test
    public void testSolution4() throws Exception{
        StoneWall t = new StoneWall();
        int[] a = {1};
        int result = t.solution2(a);
        assertEquals(1,result);
    }
}