package test;

import main.Q1;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Siyao on 2015/10/18.
 */
public class Q1Test {

    @Test
    public void testSolution() throws Exception {
        int[] A = {1, 2, 5, 9, 9};
        int N = 5;
        Q1 q = new Q1();
        int res = q.solution(A, N);
        assertEquals(2, res);
    }

    @Test
    public void testSolution2() throws Exception {
        int[] A = {1, 2};
        int N = 5;
        Q1 q = new Q1();
        int res = q.solution(A, N);
        assertEquals(-1, res);
    }

    @Test
    public void testSolution2a() throws Exception {
        int[] A = {1, 2};
        int N = 2;
        Q1 q = new Q1();
        int res = q.solution(A, N);
        assertEquals(1, res);
    }

    @Test
    public void testSolution2b() throws Exception {
        int[] A = {1, 2};
        int N = 1;
        Q1 q = new Q1();
        int res = q.solution(A, N);
        assertEquals(0, res);
    }

    @Test
    public void testSolution3() throws Exception {
        int[] A = {1, 2, 5, 7};
        int N = 5;
        Q1 q = new Q1();
        int res = q.solution(A, N);
        assertEquals(2, res);
    }

    @Test
    public void testSolution4() throws Exception {
        int[] A = {1};
        int N = 5;
        Q1 q = new Q1();
        int res = q.solution(A, N);
        assertEquals(-1, res);
    }

    @Test
    public void testSolution5() throws Exception {
        int[] A = {1};
        int N = 1;
        Q1 q = new Q1();
        int res = q.solution(A, N);
        assertEquals(0, res);
    }
    @Test
    public void testSolution6() throws Exception {
        int[] A = {1,2,3};
        int N = 1;
        Q1 q = new Q1();
        int res = q.solution(A, N);
        assertEquals(0, res);
    }
    @Test
    public void testSolution7() throws Exception {
        int[] A = {1,2,5};
        int N = 0;
        Q1 q = new Q1();
        int res = q.solution(A, N);
        assertEquals(-1, res);
    }
    @Test
    public void testSolution8() throws Exception {
        int[] A = {1,2,5};
        int N = 2;
        Q1 q = new Q1();
        int res = q.solution(A, N);
        assertEquals(1, res);
    }
    @Test
    public void testSolution9() throws Exception {
        int[] A = {1,2,5};
        int N = 5;
        Q1 q = new Q1();
        int res = q.solution(A, N);
        assertEquals(2, res);
    }
}