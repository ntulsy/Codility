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
    @Test
    public void test5() throws Exception{
        Q2 t = new Q2();
        String A = "ACACACACACAC";
        String result = t.solution(A);
        assertEquals("ACACACACACAC", result);
    }
    @Test
    public void test6() throws Exception{
        Q2 t = new Q2();
        String A = "ACACACACACACBB";
        String result = t.solution(A);
        assertEquals("ACACACACACAC", result);
    }
    @Test
    public void test7() throws Exception{
        Q2 t = new Q2();
        String A = "ACA";
        String result = t.solution(A);
        assertEquals("ACA", result);
    }
    @Test
    public void test8() throws Exception{
        Q2 t = new Q2();
        String A = "BBACACACACACAC";
        String result = t.solution(A);
        assertEquals("ACACACACACAC", result);
    }
    @Test
    public void test9() throws Exception{
        Q2 t = new Q2();
        String A = "ACACABBCACACAC";
        String result = t.solution(A);
        assertEquals("ACACACACACAC", result);
    }
    @Test
    public void test10() throws Exception{
        Q2 t = new Q2();
        String A = "AAAAAACACCCCCCACACACAC";
        String result = t.solution(A);
        assertEquals("ACACACACACAC", result);
    }

    @Test
    public void test11() throws Exception{
        Q2 t = new Q2();
        String A = "ABBA";
        String result = t.solution(A);
        assertEquals("A", result);
    }

    @Test
    public void test12() throws Exception{
        Q2 t = new Q2();
        String A = "CBBC";
        String result = t.solution(A);
        assertEquals("C", result);
    }


    @Test
    public void test13() throws Exception{
        Q2 t = new Q2();
        String A = "CA";
        String result = t.solution(A);
        assertEquals("CA", result);
    }
}