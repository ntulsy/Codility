package test;

import main.Lesson4NumberOfDiscIntersections;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Lesson4NumberOfDiscIntersectionsTest {
    @Test
    public void testSolution() throws Exception{
        Lesson4NumberOfDiscIntersections t = new Lesson4NumberOfDiscIntersections();
        int[] a = {1,5,2,1,4,0};
        int result = t.solution(a);
        assertEquals(result,11);
    }
    @Test
    public void testSolution2() throws Exception{
        Lesson4NumberOfDiscIntersections t = new Lesson4NumberOfDiscIntersections();
        int[] a = {0};
        int result = t.solution(a);
        assertEquals(result,0);
    }
    @Test
    public void testSolution3() throws Exception{
        Lesson4NumberOfDiscIntersections t = new Lesson4NumberOfDiscIntersections();
        int[] a = {1,0};
        int result = t.solution(a);
        assertEquals(result,1);
    }
    @Test
    public void testSolution4() throws Exception{
        Lesson4NumberOfDiscIntersections t = new Lesson4NumberOfDiscIntersections();
        int[] a = {1, 2147483647, 0};
        int result = t.solution(a);
        assertEquals(2,result);
    }@Test
     public void testSolution5() throws Exception{
        Lesson4NumberOfDiscIntersections t = new Lesson4NumberOfDiscIntersections();
        int[] a = {};
        int result = t.solution(a);
        assertEquals(result,0);
    }

}