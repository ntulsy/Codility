package test;

import main.L13CountDistinctSlices;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L13CountDistinctSlicesTest {
    @Test
    public void test() throws Exception {
        L13CountDistinctSlices t = new L13CountDistinctSlices();
        int[] A = {3, 4, 5, 5, 2};
        int m = 6;
        assertEquals(9, t.solution(m, A));
    }
    @Test
    public void test1() throws Exception {
        L13CountDistinctSlices t = new L13CountDistinctSlices();
        int[] A = {3, 4};
        int m = 4;
        assertEquals(3, t.solution(m, A));
    }
    @Test
    public void test2() throws Exception {
        L13CountDistinctSlices t = new L13CountDistinctSlices();
        int[] A = {3, 5, 5, 5, 2};
        int m = 6;
        assertEquals(7, t.solution(m, A));
    }
    @Test
    public void test3() throws Exception {
        L13CountDistinctSlices t = new L13CountDistinctSlices();
        int[] A = {3, 5, 6, 3, 2};
        int m = 6;
        assertEquals(13, t.solution(m, A));
    }
    @Test
    public void test4() throws Exception {
        L13CountDistinctSlices t = new L13CountDistinctSlices();
        int[] A = {3, 4, 5, 5, 2};
        int m = 6;
        assertEquals(9, t.solution(m, A));
    }



}