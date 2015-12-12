package test;

import main.L10CommonPrimeDivisors;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L10CommonPrimeDivisorsTest {
    @Test
    public void test() throws Exception {
        L10CommonPrimeDivisors t = new L10CommonPrimeDivisors();
        int[] A = {15, 10, 3};
        int[] B = {75, 30, 5};
        assertEquals(1, t.solution(A, B));
    }
}