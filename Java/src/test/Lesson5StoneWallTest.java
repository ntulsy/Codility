package test;

import main.Lesson5StoneWall;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Lesson5StoneWallTest {
    @Test
     public void testSolution() throws Exception{
        Lesson5StoneWall t = new Lesson5StoneWall();
        int[] a = {8,8,5,7,9,8,7,4,8};
        int result = t.solution2(a);
        assertEquals(7,result);
    }
    @Test
    public void testSolution2() throws Exception{
        Lesson5StoneWall t = new Lesson5StoneWall();
        int[] a = {8,8};
        int result = t.solution2(a);
        assertEquals(1,result);
    }
    @Test
    public void testSolution3() throws Exception{
        Lesson5StoneWall t = new Lesson5StoneWall();
        int[] a = {3,5,7,9,7,9,5,4};
        int result = t.solution2(a);
        assertEquals(6,result);
    }
    @Test
    public void testSolution4() throws Exception{
        Lesson5StoneWall t = new Lesson5StoneWall();
        int[] a = {1};
        int result = t.solution2(a);
        assertEquals(1,result);
    }
}