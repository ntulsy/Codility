package codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L7BracketsTest {
    @Test
    public void testSolution() throws Exception{
        L7Brackets t = new L7Brackets();
        int result = t.solution2("{[()()]}");
        assertEquals(result,1);
    }
    @Test
    public void testSolution2() throws Exception{
        L7Brackets t = new L7Brackets();
        int result = t.solution2("{[()()]");
        assertEquals(result,0);
    }
    @Test
    public void testSolution3() throws Exception{
        L7Brackets t = new L7Brackets();
        int result = t.solution2("([)()]");
        assertEquals(result,0);
    }
    @Test
    public void testSolution4() throws Exception{
        L7Brackets t = new L7Brackets();
        int result = t.solution2("");
        assertEquals(result,1);
    }
}