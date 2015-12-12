package test;

import main.L7MaxDoubleSliceSum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L7MaxDoubleSliceSumTest {
    @Test
    public void testSolution() throws Exception{
        L7MaxDoubleSliceSum t = new L7MaxDoubleSliceSum();
        int[] A = {3,2,6,-1,4,5,-1,2};
        int result = t.solution(A);
        assertEquals(17,result);
    }
    @Test
    public void testSolution2() throws Exception{
        L7MaxDoubleSliceSum t = new L7MaxDoubleSliceSum();
        int[] A = {3,2,6};
        int result = t.solution(A);
        assertEquals(0,result);
    }
    @Test
    public void testSolution3() throws Exception{
        L7MaxDoubleSliceSum t = new L7MaxDoubleSliceSum();
        int[] A = {3,2,6,-1};
        int result = t.solution(A);
        assertEquals(6,result);
    }
    @Test
    public void testSolution4() throws Exception{
        L7MaxDoubleSliceSum t = new L7MaxDoubleSliceSum();
        int[] A = {-1,-2,-3,-4,-5};
        int result = t.solution(A);
        assertEquals(0,result);
    }
    @Test
    public void testSolution5() throws Exception{
        L7MaxDoubleSliceSum t = new L7MaxDoubleSliceSum();
        int[] A = {-2,-1,-2,-3,5,6,0};
        int result = t.solution(A);
        assertEquals(11,result);
    }

}