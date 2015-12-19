package test;

import main.L15NumberSolitaire;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L15NumberSolitaireTest {
    @Test
    public void test() throws Exception {
        L15NumberSolitaire t = new L15NumberSolitaire();
        int[] A = {1, -2, 0, 9, -1, -2};
        assertEquals(8, t.solution(A));
    }
    @Test
    public void test1() throws Exception {
        L15NumberSolitaire t = new L15NumberSolitaire();
        int[] A = {-1, -2, -3};
        assertEquals(-4, t.solution(A));
    }
    @Test
    public void test2() throws Exception {
        L15NumberSolitaire t = new L15NumberSolitaire();
        int[] A = {1, -2, 1, 9, -1, -2};
        assertEquals(9, t.solution(A));
    }
    @Test
    public void test3() throws Exception {
        L15NumberSolitaire t = new L15NumberSolitaire();
        int[] A = {-5, 2, -2, -1, -2, -4, -1, -2, 3, 2};
        assertEquals(1, t.solution(A));
    }
    @Test
    public void test4() throws Exception {
        L15NumberSolitaire t = new L15NumberSolitaire();
        int[] A = {1, -1, 1, -1, 1, -1, 1};
        assertEquals(4, t.solution(A));
    }
    @Test
    public void test5() throws Exception {
        L15NumberSolitaire t = new L15NumberSolitaire();
        int[] A = {1, -2, 0, 9, -1, -2};
        assertEquals(8, t.solution(A));
    }




}