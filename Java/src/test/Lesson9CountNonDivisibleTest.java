package test;

import main.Lesson9CountNonDivisible;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class Lesson9CountNonDivisibleTest {
    @Test
    public void test() throws Exception{
        Lesson9CountNonDivisible t = new Lesson9CountNonDivisible();
        int[] A = {3, 1, 2, 3, 6};
        int[] result = t.solution3( A);
        System.out.println(Arrays.toString(result));
        int[] expected = {2, 4, 3, 2, 0};
        assertEquals(true, Arrays.equals(result, expected));
    }
}