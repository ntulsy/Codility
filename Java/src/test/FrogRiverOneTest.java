package test;

import main.FrogRiverOne;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrogRiverOneTest {

    @Test
    public void testSolution() throws Exception{
        FrogRiverOne t = new FrogRiverOne();
        int[] A = {1,3,1,4,2,3,1,4};
        int X = 5;
        int result = t.solution(X,A);
        assertEquals(-1,result);
    }

}