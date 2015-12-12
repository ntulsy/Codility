package test;

import main.L3GenomicRangeQuery;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class L3GenomicRangeQueryTest {
    @Test
    public void testSolution() throws Exception{
        L3GenomicRangeQuery t = new L3GenomicRangeQuery();
        String S = "CAGCCTA";
        int[] P = {2,5,0};
        int[] Q = {4,5,6};
        int[] result = {2,4,1};
        assertEquals(true,Arrays.equals(result, t.solution2(S, P, Q)));
    }
    @Test
    public void testSolution2() throws Exception{
        L3GenomicRangeQuery t = new L3GenomicRangeQuery();
        String S = "AA";
        int[] P = {1,0};
        int[] Q = {1,1};
        int[] result = {1,1};
        assertEquals(true,Arrays.equals(result, t.solution2(S, P, Q)));
    }

}