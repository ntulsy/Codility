package test;

import main.L9MaxProfit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L9MaxProfitTest {
    @Test
    public void test() throws Exception{
        L9MaxProfit t = new L9MaxProfit();
        int[] A  = {3,2,1,4,5,8};
        int result = t.solution(A);
        assertEquals(7,result);
    }
    @Test
    public void test2() throws Exception{
        L9MaxProfit t = new L9MaxProfit();
        int[] A  = {3};
        int result = t.solution(A);
        assertEquals(0,result);
    }
    @Test
    public void test3() throws Exception{
        L9MaxProfit t = new L9MaxProfit();
        int[] A  = {3,2,1};
        int result = t.solution(A);
        assertEquals(0,result);
    }
    @Test
    public void test4() throws Exception{
        L9MaxProfit t = new L9MaxProfit();
        int[] A  = {1,1,4,2,5,8};
        int result = t.solution(A);
        assertEquals(7,result);
    }

}