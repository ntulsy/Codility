package test;

import main.Lesson2FrogRiverOne;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Lesson2FrogRiverOneTest {

    @Test
    public void testSolution() throws Exception{
        Lesson2FrogRiverOne t = new Lesson2FrogRiverOne();
        int[] A = {1,3,1,4,2,3,1,4};
        int X = 5;
        int result = t.solution(X,A);
        assertEquals(-1,result);
    }

}