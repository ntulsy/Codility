package codility;

<<<<<<< HEAD:Java/src/test/L1FrogJumpTest.java
import main.L3FrogJump;
=======
>>>>>>> 60342aaac0d527557e9afce8c0ec700ec5999272:Java/src/test/java/codility/L3FrogJumpTest.java
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