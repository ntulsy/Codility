package test;

import main.Q3;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q3Test {
    @Test
    public void test() throws Exception{
        Q3 t = new Q3();
        int[] A = {3,5,6,3,3,5};
        int result = t.solution(A);
        assertEquals(4,result);
    }
    @Test
    public void test2() throws Exception{
        Q3 t = new Q3();
        int[] A = {3};
        int result = t.solution(A);
        assertEquals(0,result);
    }
    @Test
    public void test3() throws Exception{
        Q3 t = new Q3();
        int[] A = {3,5};
        int result = t.solution(A);
        assertEquals(0,result);
    }
    @Test
    public void test4() throws Exception{
        Q3 t = new Q3();
        int[] A = {3,3};
        int result = t.solution(A);
        assertEquals(1,result);
    }@Test
     public void test5() throws Exception{
        Q3 t = new Q3();
        int[] A = {3,3,3,3,3,3,3,3,3,3};
        int result = t.solution(A);
        assertEquals(45,result);
    }@Test
     public void test6() throws Exception{
        Q3 t = new Q3();
        int[] A = {3,5};
        int result = t.solution(A);
        assertEquals(0,result);
    }@Test
     public void test7() throws Exception{
        Q3 t = new Q3();
        int[] A = {3,5};
        int result = t.solution(A);
        assertEquals(0,result);
    }@Test
     public void test8() throws Exception{
        Q3 t = new Q3();
        int[] A = {3,5};
        int result = t.solution(A);
        assertEquals(0,result);
    }






}