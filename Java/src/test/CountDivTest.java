package test;

import main.CountDiv;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountDivTest {
    @Test
    public void testSolution() throws Exception{
        CountDiv t = new CountDiv();
        int result = t.solution(6,11,2);
        assertEquals(result,3);
    }
    @Test
    public void testSolution1() throws Exception{
        CountDiv t = new CountDiv();
        int result = t.solution(1,1,2);
        assertEquals(result,0);
    }

}