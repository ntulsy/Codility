package codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L16MaxNonoverlappingSegmentsTest {
    @Test
    public void test() throws Exception {
        L16MaxNonoverlappingSegments t = new L16MaxNonoverlappingSegments();
        int[] A = {1, 3, 7, 9, 9};
        int[] B = {5, 6, 8, 9, 10};
        assertEquals(3, t.solution(A, B));
    }
    @Test
    public void test1() throws Exception {
        L16MaxNonoverlappingSegments t = new L16MaxNonoverlappingSegments();
        int[] A = {1, 2};
        int[] B = {3, 5};
        assertEquals(1, t.solution(A, B));
    }
    @Test
    public void test2() throws Exception {
        L16MaxNonoverlappingSegments t = new L16MaxNonoverlappingSegments();
        int[] A = {1, 3, 7, 9, 9};
        int[] B = {4, 6, 8, 9, 10};
        assertEquals(3, t.solution(A, B));
    }
    @Test
    public void test3() throws Exception {
        L16MaxNonoverlappingSegments t = new L16MaxNonoverlappingSegments();
        int[] A = {1, 3, 7, 9, 9};
        int[] B = {5, 6, 8, 9, 10};
        assertEquals(3, t.solution(A, B));
    }@Test
     public void test4() throws Exception {
        L16MaxNonoverlappingSegments t = new L16MaxNonoverlappingSegments();
        int[] A = {1, 3, 7, 9, 9};
        int[] B = {5, 6, 8, 9, 10};
        assertEquals(3, t.solution(A, B));
    }



}