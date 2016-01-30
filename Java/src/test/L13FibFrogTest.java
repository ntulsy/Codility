package test;

import main.L13FibFrog;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L13FibFrogTest {
    @Test
    public void test() throws Exception {
        L13FibFrog t = new L13FibFrog();
        int[] A = {0,0,0,1,1,0,1,0,0,0,0};
        assertEquals(3, t.solution(A));
    }
    @Test
    public void test2() throws Exception {
        L13FibFrog t = new L13FibFrog();
        int[] A = {0,1};
        assertEquals(1, t.solution(A));
    }
    @Test
    public void test3() throws Exception {
        L13FibFrog t = new L13FibFrog();
        int[] A = {0};
        assertEquals(1, t.solution(A));
    }
    @Test
     public void test4() throws Exception {
        L13FibFrog t = new L13FibFrog();
        int[] A = {0,1,0,1};
        assertEquals(1, t.solution(A));
    }
    @Test
     public void test5() throws Exception {
        L13FibFrog t = new L13FibFrog();
        int[] A = {0, 0, 0};
        assertEquals(-1, t.solution(A));
    }
    @Test
    public void test6() throws Exception {
        L13FibFrog t = new L13FibFrog();
        int[] A = {1, 0, 0, 0, 0};
        assertEquals(2, t.solution(A));
    }
    @Test
    public void test7() throws Exception {
        L13FibFrog t = new L13FibFrog();
        int[] A = {0,1,0,1,1,0,1,0,0,0,0};
        assertEquals(3, t.solution(A));
    }



}