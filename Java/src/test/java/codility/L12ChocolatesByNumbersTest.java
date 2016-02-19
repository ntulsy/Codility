package codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L12ChocolatesByNumbersTest {
    @Test
    public void test() throws Exception {
        L12ChocolatesByNumbers t = new L12ChocolatesByNumbers();
        assertEquals(5, t.solution(10, 4));
    }
    @Test
    public void test2() throws Exception {
        L12ChocolatesByNumbers t = new L12ChocolatesByNumbers();
        assertEquals(947853, t.solution(947853, 4453));
    }
    @Test
    public void test3() throws Exception {
        L12ChocolatesByNumbers t = new L12ChocolatesByNumbers();
        assertEquals(1000000000, t.solution(1000000000, 1));
    }

}