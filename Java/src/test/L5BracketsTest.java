package test;

import main.L5Brackets;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L5BracketsTest {
    @Test
    public void testSolution() throws Exception{
        L5Brackets t = new L5Brackets();
        int result = t.solution2("{[()()]}");
        assertEquals(result,1);
    }
    @Test
    public void testSolution2() throws Exception{
        L5Brackets t = new L5Brackets();
        int result = t.solution2("{[()()]");
        assertEquals(result,0);
    }
    @Test
    public void testSolution3() throws Exception{
        L5Brackets t = new L5Brackets();
        int result = t.solution2("([)()]");
        assertEquals(result,0);
    }
    @Test
    public void testSolution4() throws Exception{
        L5Brackets t = new L5Brackets();
        int result = t.solution2("");
        assertEquals(result,1);
    }
}