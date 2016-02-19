package codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L12CommonPrimeDivisorsTest {
    @Test
    public void test() throws Exception {
        L12CommonPrimeDivisors t = new L12CommonPrimeDivisors();
        int[] A = {15, 10, 3};
        int[] B = {75, 30, 5};
        assertEquals(1, t.solution(A, B));
    }
}