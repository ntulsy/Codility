package test;

import main.L12MinMaxDivision;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L12MinMaxDivisionTest {
    @Test
    public void test() throws Exception {
        L12MinMaxDivision t = new L12MinMaxDivision();
        int[] A = {2, 1, 5, 1, 2, 2, 2};
        int K = 3;
        int M = 5;
        assertEquals(6, t.solution(K, M, A));
    }
    @Test
    public void test1() throws Exception {
        L12MinMaxDivision t = new L12MinMaxDivision();
        int[] A = {2, 1};
        int K = 1;
        int M = 2;
        assertEquals(3, t.solution(K, M, A));
    }
    @Test
    public void test2() throws Exception {
        L12MinMaxDivision t = new L12MinMaxDivision();
        int[] A = {2, 1, 5, 1, 2};
        int K = 3;
        int M = 5;
        assertEquals(5, t.solution(K, M, A));
    }
    @Test
    public void test3() throws Exception {
        L12MinMaxDivision t = new L12MinMaxDivision();
        int[] A = {0,0,0,0,1};
        int K = 2;
        int M = 1;
        assertEquals(1, t.solution(K, M, A));
    }


}