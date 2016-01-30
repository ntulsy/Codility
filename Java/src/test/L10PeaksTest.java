package test;

import main.L10Peaks;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L10PeaksTest {
    @Test
    public void test() throws Exception{
        L10Peaks t = new L10Peaks();
        int[] A = {1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
        int result = t.solution(A);
        assertEquals(3, result);
    }

    @Test
    public void test2() throws Exception{
        L10Peaks t = new L10Peaks();
        int[] A = {1, 3, 2, 1};
        int result = t.solution(A);
        assertEquals(1, result);
    }
    @Test
    public void test3() throws Exception{
        L10Peaks t = new L10Peaks();
        int[] A = {1, 2, 4, 3};
        int result = t.solution(A);
        assertEquals(1, result);
    }@Test
     public void test4() throws Exception{
        L10Peaks t = new L10Peaks();
        int[] A = {1,5,4,6,7,8,5,6,3};
        int result = t.solution(A);
        assertEquals(3, result);
    }


}