package test;

import main.Lesson7MaxProfit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Lesson7MaxProfitTest {
    @Test
    public void test() throws Exception{
        Lesson7MaxProfit t = new Lesson7MaxProfit();
        int[] A  = {3,2,1,4,5,8};
        int result = t.solution(A);
        assertEquals(7,result);
    }
    @Test
    public void test2() throws Exception{
        Lesson7MaxProfit t = new Lesson7MaxProfit();
        int[] A  = {3};
        int result = t.solution(A);
        assertEquals(0,result);
    }
    @Test
    public void test3() throws Exception{
        Lesson7MaxProfit t = new Lesson7MaxProfit();
        int[] A  = {3,2,1};
        int result = t.solution(A);
        assertEquals(0,result);
    }
    @Test
    public void test4() throws Exception{
        Lesson7MaxProfit t = new Lesson7MaxProfit();
        int[] A  = {1,1,4,2,5,8};
        int result = t.solution(A);
        assertEquals(7,result);
    }

}