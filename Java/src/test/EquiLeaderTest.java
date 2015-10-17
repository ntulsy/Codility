package test;

import main.EquiLeader;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EquiLeaderTest {
    @Test
    public void testSolution() throws Exception{
        EquiLeader t = new EquiLeader();
        int[] A = {4,3,4,4,4,2};
        int result = t.solution(A);
        assertEquals(2, result);
    }
    @Test
    public void testSolution2() throws Exception{
        EquiLeader t = new EquiLeader();
        int[] A = {0,1};
        int result = t.solution(A);
        assertEquals(0, result);
    }
    @Test
    public void testSolution3() throws Exception{
        EquiLeader t = new EquiLeader();
        int[] A = {0,1,1};
        int result = t.solution(A);
        assertEquals(0, result);
    }
    @Test
    public void testSolution4() throws Exception{
        EquiLeader t = new EquiLeader();
        int[] A = {4, 4, 2, 5, 3, 4, 4, 4};
        int result = t.solution(A);
        assertEquals(3, result);
    }

}