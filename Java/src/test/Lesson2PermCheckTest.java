package test;

import main.Lesson2PermCheck;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Lesson2PermCheckTest {
    @Test
    public void testSolution() throws Exception{
        Lesson2PermCheck t = new Lesson2PermCheck();
        int[] A = {4,1,3,2};
        int result = t.solution(A);
        assertEquals(1,result);
    }
    @Test
    public void testSolution2() throws Exception{
        Lesson2PermCheck t = new Lesson2PermCheck();
        int[] A = {4,1,3};
        int result = t.solution(A);
        assertEquals(0,result);
    }

}