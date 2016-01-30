package codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L7FishTest {
    @Test
    public void testSolution() throws Exception{
        L7Fish t = new L7Fish();
        int[] A = {4,3,2,1,5};
        int[] B = {0,1,0,0,0};
        int result = t.solution(A,B);
        assertEquals(2,result);
    }
    @Test
    public void testSolution2() throws Exception{
        L7Fish t = new L7Fish();
        int[] A = {4,3,2,1,5};
        int[] B = {1,1,1,1,1};
        int result = t.solution(A,B);
        assertEquals(5,result);
    }
    @Test
    public void testSolution3() throws Exception{
        L7Fish t = new L7Fish();
        int[] A = {4,3};
        int[] B = {0,1};
        int result = t.solution(A,B);
        assertEquals(2,result);
    }
    @Test
    public void testSolution4() throws Exception{
        L7Fish t = new L7Fish();
        int[] A = {4,3};
        int[] B = {1,0};
        int result = t.solution(A,B);
        assertEquals(1,result);
    }

}