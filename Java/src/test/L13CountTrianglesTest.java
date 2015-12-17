package test;

import main.L13CountTriangles;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L13CountTrianglesTest {
    @Test
    public void test() throws Exception {
        int[] A = {10, 2, 5, 1, 8, 12};
        L13CountTriangles t = new L13CountTriangles();
        assertEquals(4, t.solution(A));
    }

}