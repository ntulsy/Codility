package test;

import main.Lesson5Brackets;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Lesson5BracketsTest {
    @Test
    public void testSolution() throws Exception{
        Lesson5Brackets t = new Lesson5Brackets();
        int result = t.solution2("{[()()]}");
        assertEquals(result,1);
    }
    @Test
    public void testSolution2() throws Exception{
        Lesson5Brackets t = new Lesson5Brackets();
        int result = t.solution2("{[()()]");
        assertEquals(result,0);
    }
    @Test
    public void testSolution3() throws Exception{
        Lesson5Brackets t = new Lesson5Brackets();
        int result = t.solution2("([)()]");
        assertEquals(result,0);
    }
    @Test
    public void testSolution4() throws Exception{
        Lesson5Brackets t = new Lesson5Brackets();
        int result = t.solution2("");
        assertEquals(result,1);
    }
}