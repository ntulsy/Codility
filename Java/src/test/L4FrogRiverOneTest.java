package test;

import main.L4FrogRiverOne;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L4FrogRiverOneTest {

    @Test
    public void testSolution() throws Exception{
        L4FrogRiverOne t = new L4FrogRiverOne();
        int[] A = {1,3,1,4,2,3,1,4};
        int X = 5;
        int result = t.solution(X,A);
        assertEquals(-1,result);
    }

}