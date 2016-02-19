package codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L5CountDivTest {
    @Test
    public void testSolution() throws Exception{
        L5CountDiv t = new L5CountDiv();
        int result = t.solution(6,11,2);
        assertEquals(result,3);
    }
    @Test
    public void testSolution1() throws Exception{
        L5CountDiv t = new L5CountDiv();
        int result = t.solution(1,1,2);
        assertEquals(result,0);
    }

}