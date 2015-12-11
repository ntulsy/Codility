package test;

import main.Lesson1PermMissingElem;
import org.junit.Test;

import static org.junit.Assert.*;

public class Lesson1PermMissingElemTest {
    @Test
    public void testSolution() throws Exception {
        Lesson1PermMissingElem t = new Lesson1PermMissingElem();
        int[] A = {2,3,1,4};
        int N = 4;
        int result = t.solution2(A);
        assertEquals(5,result);

    }

    @Test
    public void testSolution2() throws Exception {
        Lesson1PermMissingElem t = new Lesson1PermMissingElem();
        int[] A = {2,3,1};
        int N = 3;
        int result = t.solution2(A);
        assertEquals(4,result);

    }
}