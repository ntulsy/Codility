package test;

import main.Lesson5Nesting;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Lesson5NestingTest {
    @Test
    public void testSolution() throws Exception{
        Lesson5Nesting t = new Lesson5Nesting();
        String s = "(())";
        int result = t.solution(s);
        assertEquals(1,result);
    }
    @Test
    public void testSolution2() throws Exception{
        Lesson5Nesting t = new Lesson5Nesting();
        String s = "(()))";
        int result = t.solution(s);
        assertEquals(0,result);
    }
    @Test
    public void testSolution3() throws Exception{
        Lesson5Nesting t = new Lesson5Nesting();
        String s = "(()(()))";
        int result = t.solution(s);
        assertEquals(1,result);
    }


}