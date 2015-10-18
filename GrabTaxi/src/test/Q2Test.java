package test;

import main.Q2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q2Test {
    @Test
    public void test() throws Exception{
        Q2 t = new Q2();
        String A = "ABBCC";
        String result = t.solution(A);
        assertEquals("AC", result);
    }
    @Test
    public void test2() throws Exception{
        Q2 t = new Q2();
        String A = "AC";
        String result = t.solution(A);
        assertEquals("AC", result);
    }
    @Test
    public void test3() throws Exception{
        Q2 t = new Q2();
        String A = "C";
        String result = t.solution(A);
        assertEquals("C", result);
    }
    @Test
    public void test4() throws Exception{
        Q2 t = new Q2();
        String A = "BB";
        String result = t.solution(A);
        assertEquals("BB", result);
    }

}