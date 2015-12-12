package test;

import main.L1FrogJump;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L1FrogJumpTest {
    @Test
    public void testSolution() throws Exception {
        L1FrogJump t = new L1FrogJump();
        int X = 10, Y = 85, D=30;
        int result = t.solution(X, Y, D);
        assertEquals(3, result);
    }
}