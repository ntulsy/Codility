package test;

import main.L3CountDiv;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L3CountDivTest {
    @Test
    public void testSolution() throws Exception{
        L3CountDiv t = new L3CountDiv();
        int result = t.solution(6,11,2);
        assertEquals(result,3);
    }
    @Test
    public void testSolution1() throws Exception{
        L3CountDiv t = new L3CountDiv();
        int result = t.solution(1,1,2);
        assertEquals(result,0);
    }

}