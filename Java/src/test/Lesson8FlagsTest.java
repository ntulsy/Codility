package test;

import main.Lesson8Flags;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Lesson8FlagsTest {
    @Test
    public void test() throws Exception{
        Lesson8Flags t = new Lesson8Flags();
        int[] A = {1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
        int result = t.goldenSolution(A);
        assertEquals(3, result);
    }
    @Test
    public void test1() throws Exception{
        Lesson8Flags t = new Lesson8Flags();
        int[] A = {1, 3, 2};
        int result = t.goldenSolution(A);
        assertEquals(1, result);
    }

}