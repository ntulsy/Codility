package codility;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class L11CountSemiprimesTest {
    @Test
    public void test() throws Exception{
        L11CountSemiprimes t = new L11CountSemiprimes();
        int[] P = {1, 4, 16};
        int[] Q = {26, 10, 20};
        int[] result = t.solution( 26, P, Q);
        int[] expected = {10,4,0};
        assertEquals(true, Arrays.equals(result, expected));
    }
    @Test
    public void test1() throws Exception{
        L11CountSemiprimes t = new L11CountSemiprimes();
        int[] P = {1, 4, 16};
        int[] Q = {1, 4, 20};
        int[] result = t.solution( 26, P, Q);
        int[] expected = {0,1,0};
        assertEquals(true, Arrays.equals(result, expected));
    }
    @Test
    public void test2() throws Exception{
        L11CountSemiprimes t = new L11CountSemiprimes();
        int[] P = {1, 4, 16};
        int[] Q = {26, 10, 20};
        int[] result = t.solution( 26, P, Q);
        int[] expected = {10,4,0};
        assertEquals(true, Arrays.equals(result, expected));
    }
    @Test
    public void test3() throws Exception{
        L11CountSemiprimes t = new L11CountSemiprimes();
        int[] P = {1, 4, 16};
        int[] Q = {26, 10, 20};
        int[] result = t.solution( 26, P, Q);
        int[] expected = {10,4,0};
        assertEquals(true, Arrays.equals(result, expected));
    }
    @Test
    public void test4() throws Exception{
        L11CountSemiprimes t = new L11CountSemiprimes();
        int[] P = {1, 4, 16};
        int[] Q = {26, 10, 20};
        int[] result = t.solution( 26, P, Q);
        int[] expected = {10,4,0};
        assertEquals(true, Arrays.equals(result, expected));
    }

}