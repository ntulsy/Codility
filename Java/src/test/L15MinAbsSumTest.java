package test;

import main.L15MinAbsSum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L15MinAbsSumTest {
    @Test
    public void test() throws Exception {
        L15MinAbsSum t = new L15MinAbsSum();
        int[] A = {1, 5, 2, -2};
        assertEquals(0, t.sub_solution(A));
    }
    @Test
    public void test1() throws Exception {
        L15MinAbsSum t = new L15MinAbsSum();
        int[] A = {3, 1};
        assertEquals(2, t.sub_solution(A));
    }
    @Test
    public void test2() throws Exception {
        L15MinAbsSum t = new L15MinAbsSum();
        int[] A = {1, -1, 1, -1, 1, 1};
        assertEquals(0, t.sub_solution(A));
    }
    @Test
    public void test3() throws Exception {
        L15MinAbsSum t = new L15MinAbsSum();
        int[] A = {1, -1, 1, -1, 1};
        assertEquals(1, t.sub_solution(A));
    }
    @Test
    public void test4() throws Exception {
        L15MinAbsSum t = new L15MinAbsSum();
        int[] A = {2, 5, 2, -2};
        assertEquals(1, t.sub_solution(A));
    }
    @Test
    public void test5() throws Exception {
        L15MinAbsSum t = new L15MinAbsSum();
        int[] A = {7};
        assertEquals(7, t.sub_solution(A));
    }

}