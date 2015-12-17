package test;

import main.L13MinAbsSumOfTwo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L13MinAbsSumOfTwoTest {
    @Test
    public void test() throws Exception {
        int[] A = {1, 4, -3};
        L13MinAbsSumOfTwo t = new L13MinAbsSumOfTwo();
        assertEquals(1, t.solution(A));
    }

    @Test
    public void test2() throws Exception {
        int[] A = {-8, 4, 5, -10, 3};
        L13MinAbsSumOfTwo t = new L13MinAbsSumOfTwo();
        assertEquals(3, t.solution(A));
    }

    @Test
    public void test3() throws Exception {
        int[] A = {0,0,0,0,0};
        L13MinAbsSumOfTwo t = new L13MinAbsSumOfTwo();
        assertEquals(0, t.solution(A));
    }
    @Test
    public void test4() throws Exception {
        int[] A = {-1,0,1};
        L13MinAbsSumOfTwo t = new L13MinAbsSumOfTwo();
        assertEquals(0, t.solution(A));
    }@Test
     public void test5() throws Exception {
        int[] A = {-1,1,2};
        L13MinAbsSumOfTwo t = new L13MinAbsSumOfTwo();
        assertEquals(0, t.solution(A));
    }@Test
     public void test6() throws Exception {
        int[] A = {-10,20,3};
        L13MinAbsSumOfTwo t = new L13MinAbsSumOfTwo();
        assertEquals(6, t.solution(A));
    }
    @Test
    public void test7() throws Exception {
        int[] A = {-11, 9, 10};
        L13MinAbsSumOfTwo t = new L13MinAbsSumOfTwo();
        assertEquals(1, t.solution(A));
    }




}