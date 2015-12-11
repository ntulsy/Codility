package test;

import main.Lesson1FrogJump;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Lesson1FrogJumpTest {
    @Test
    public void testSolution() throws Exception {
        Lesson1FrogJump t = new Lesson1FrogJump();
        int X = 10, Y = 85, D=30;
        int result = t.solution(X, Y, D);
        assertEquals(3, result);
    }
}