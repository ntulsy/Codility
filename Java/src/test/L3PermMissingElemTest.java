package test;

import main.L3PermMissingElem;
import org.junit.Test;

import static org.junit.Assert.*;

public class L3PermMissingElemTest {
    @Test
    public void testSolution() throws Exception {
        L3PermMissingElem t = new L3PermMissingElem();
        int[] A = {2,3,1,4};
        int N = 4;
        int result = t.solution2(A);
        assertEquals(5,result);

    }

    @Test
    public void testSolution2() throws Exception {
        L3PermMissingElem t = new L3PermMissingElem();
        int[] A = {2,3,1};
        int N = 3;
        int result = t.solution2(A);
        assertEquals(4,result);

    }
}