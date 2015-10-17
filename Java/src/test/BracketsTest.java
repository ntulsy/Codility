package test;

import main.Brackets;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BracketsTest {
    @Test
    public void testSolution() throws Exception{
        Brackets t = new Brackets();
        int result = t.solution2("{[()()]}");
        assertEquals(result,1);
    }
    @Test
    public void testSolution2() throws Exception{
        Brackets t = new Brackets();
        int result = t.solution2("{[()()]");
        assertEquals(result,0);
    }
    @Test
    public void testSolution3() throws Exception{
        Brackets t = new Brackets();
        int result = t.solution2("([)()]");
        assertEquals(result,0);
    }
    @Test
    public void testSolution4() throws Exception{
        Brackets t = new Brackets();
        int result = t.solution2("");
        assertEquals(result,1);
    }
}