package test;

import main.L15CountTriangles;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L15CountTrianglesTest {
    @Test
    public void test() throws Exception {
        int[] A = {10, 2, 5, 1, 8, 12};
        L15CountTriangles t = new L15CountTriangles();
        assertEquals(4, t.solution(A));
    }

}