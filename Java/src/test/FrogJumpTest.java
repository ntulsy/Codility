package test;

import main.FrogJump;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrogJumpTest {
    @Test
    public void testSolution() throws Exception {
        FrogJump t = new FrogJump();
        int X = 10, Y = 85, D=30;
        int result = t.solution(X, Y, D);
        assertEquals(3, result);
    }
}