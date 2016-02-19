package codility;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class L13LadderTest {
    @Test
    public void test() throws Exception {
        L13Ladder t = new L13Ladder();
        int[] A = {4, 4, 5, 5, 1};
        int[] B = {3, 2, 4, 3, 1};
        int[] expected = {5, 1, 8, 0, 1};
        assertEquals(true, Arrays.equals(expected, t.solution(A, B)));
    }
    @Test
    public void test1() throws Exception {
        L13Ladder t = new L13Ladder();
        int[] A = {1};
        int[] B = {1};
        int[] expected = {1};
        assertEquals(true, Arrays.equals(expected, t.solution(A, B)));
    }

}