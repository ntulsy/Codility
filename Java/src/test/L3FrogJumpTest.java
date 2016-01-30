package test;

import main.L3FrogJump;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L3FrogJumpTest {
    @Test
    public void testSolution() throws Exception {
        L3FrogJump t = new L3FrogJump();
        int X = 10, Y = 85, D=30;
        int result = t.solution(X, Y, D);
        assertEquals(3, result);
    }
}