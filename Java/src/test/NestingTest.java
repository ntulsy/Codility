package test;

import main.Nesting;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NestingTest {
    @Test
    public void testSolution() throws Exception{
        Nesting t = new Nesting();
        String s = "(())";
        int result = t.solution(s);
        assertEquals(1,result);
    }
    @Test
    public void testSolution2() throws Exception{
        Nesting t = new Nesting();
        String s = "(()))";
        int result = t.solution(s);
        assertEquals(0,result);
    }
    @Test
    public void testSolution3() throws Exception{
        Nesting t = new Nesting();
        String s = "(()(()))";
        int result = t.solution(s);
        assertEquals(1,result);
    }


}