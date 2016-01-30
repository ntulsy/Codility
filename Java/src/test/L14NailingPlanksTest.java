package test;

import main.L14NailingPlanks;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L14NailingPlanksTest {
    @Test
    public void test() throws Exception {
        L14NailingPlanks t = new L14NailingPlanks();
        int[] A = {1, 4, 5, 8};
        int[] B = {4, 5, 9, 10};
        int[] C = {4, 6, 7, 10, 2};
        assertEquals(4, t.solution(A, B, C));
    }
    @Test
    public void test1() throws Exception {
        L14NailingPlanks t = new L14NailingPlanks();
        int[] A = {1, 2, 4, 1};
        int[] B = {6, 3, 5, 7};
        int[] C = {5, 2, 3, 4};
        assertEquals(2, t.solution(A, B, C));
    }
    @Test
    public void test2() throws Exception {
        L14NailingPlanks t = new L14NailingPlanks();
        int[] A = {1, 2, 4, 1};
        int[] B = {6, 3, 5, 7};
        int[] C = {2, 3};
        assertEquals(-1, t.solution(A, B, C));
    }
    @Test
    public void test3() throws Exception {
        L14NailingPlanks t = new L14NailingPlanks();
        int[] A = {5, 2, 4, 1};
        int[] B = {6, 3, 5, 7};
        int[] C = {5, 2, 3};
        assertEquals(2, t.solution(A, B, C));
    }

}