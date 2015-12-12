package test;

import main.L5Nesting;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L5NestingTest {
    @Test
    public void testSolution() throws Exception{
        L5Nesting t = new L5Nesting();
        String s = "(())";
        int result = t.solution(s);
        assertEquals(1,result);
    }
    @Test
    public void testSolution2() throws Exception{
        L5Nesting t = new L5Nesting();
        String s = "(()))";
        int result = t.solution(s);
        assertEquals(0,result);
    }
    @Test
    public void testSolution3() throws Exception{
        L5Nesting t = new L5Nesting();
        String s = "(()(()))";
        int result = t.solution(s);
        assertEquals(1,result);
    }


}