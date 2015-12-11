package test;

import main.Lesson3CountDiv;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Lesson3CountDivTest {
    @Test
    public void testSolution() throws Exception{
        Lesson3CountDiv t = new Lesson3CountDiv();
        int result = t.solution(6,11,2);
        assertEquals(result,3);
    }
    @Test
    public void testSolution1() throws Exception{
        Lesson3CountDiv t = new Lesson3CountDiv();
        int result = t.solution(1,1,2);
        assertEquals(result,0);
    }

}