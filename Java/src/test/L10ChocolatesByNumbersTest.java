package test;

import main.L10ChocolatesByNumbers;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L10ChocolatesByNumbersTest {
    @Test
    public void test() throws Exception {
        L10ChocolatesByNumbers t = new L10ChocolatesByNumbers();
        assertEquals(5, t.solution(10, 4));
    }
    @Test
    public void test2() throws Exception {
        L10ChocolatesByNumbers t = new L10ChocolatesByNumbers();
        assertEquals(947853, t.solution(947853, 4453));
    }
    @Test
    public void test3() throws Exception {
        L10ChocolatesByNumbers t = new L10ChocolatesByNumbers();
        assertEquals(1000000000, t.solution(1000000000, 1));
    }

}