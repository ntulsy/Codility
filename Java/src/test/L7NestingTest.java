package test;

import main.L7Nesting;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L7NestingTest {
    @Test
    public void testSolution() throws Exception{
        L7Nesting t = new L7Nesting();
        String s = "(())";
        int result = t.solution(s);
        assertEquals(1,result);
    }
    @Test
    public void testSolution2() throws Exception{
        L7Nesting t = new L7Nesting();
        String s = "(()))";
        int result = t.solution(s);
        assertEquals(0,result);
    }
    @Test
    public void testSolution3() throws Exception{
        L7Nesting t = new L7Nesting();
        String s = "(()(()))";
        int result = t.solution(s);
        assertEquals(1,result);
    }


}