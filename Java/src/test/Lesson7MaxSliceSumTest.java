package test;

import main.Lesson7MaxSliceSum;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Lesson7MaxSliceSumTest {
    @Test
    public void testSoluiton() throws Exception{
        Lesson7MaxSliceSum t = new Lesson7MaxSliceSum();
        int[] A = {-10};
        int result = t.solution(A);
        assertEquals(-10, result);
    }

    @Test
    public void testSoluiton2() throws Exception{
        Lesson7MaxSliceSum t = new Lesson7MaxSliceSum();
        int[] A = {3,2,-6,4,0};
        int result = t.solution(A);
        assertEquals(5, result);
    }

    @Test
    public void testSoluiton3() throws Exception{
        Lesson7MaxSliceSum t = new Lesson7MaxSliceSum();
        int[] A = {-2,-11};
        int result = t.solution(A);
        assertEquals(-2, result);
    }
    @Test
    public void testSoluiton4() throws Exception{
        Lesson7MaxSliceSum t = new Lesson7MaxSliceSum();
        int[] A = {-2,-5,0};
        int result = t.solution(A);
        assertEquals(0, result);
    }
    @Test
    public void testSoluiton5() throws Exception{
        Lesson7MaxSliceSum t = new Lesson7MaxSliceSum();
        int[] A = {-1000000};
        int result = t.solution(A);
        assertEquals(-1000000, result);
    }

}