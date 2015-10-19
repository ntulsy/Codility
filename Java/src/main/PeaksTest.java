package main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PeaksTest {
    @Test
    public void test() throws Exception{
        Peaks t = new Peaks();
        int[] A = {1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
        int result = t.solution(A);
        assertEquals(3, result);
    }

    @Test
    public void test2() throws Exception{
        Peaks t = new Peaks();
        int[] A = {1, 2, 3, 4};
        int result = t.solution(A);
        assertEquals(0, result);
    }
    @Test
    public void test3() throws Exception{
        Peaks t = new Peaks();
        int[] A = {1, 2, 4, 3};
        int result = t.solution(A);
        assertEquals(1, result);
    }@Test
     public void test4() throws Exception{
        Peaks t = new Peaks();
        int[] A = {1,5,4,6,7,8,5,6,3};
        int result = t.solution(A);
        assertEquals(3, result);
    }


}