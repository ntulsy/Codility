package test;

import main.GenomicRangeQuery;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class GenomicRangeQueryTest {
    @Test
    public void testSolution() throws Exception{
        GenomicRangeQuery t = new GenomicRangeQuery();
        String S = "CAGCCTA";
        int[] P = {2,5,0};
        int[] Q = {4,5,6};
        int[] result = {2,4,1};
        assertEquals(true,Arrays.equals(result, t.solution2(S, P, Q)));
    }
    @Test
    public void testSolution2() throws Exception{
        GenomicRangeQuery t = new GenomicRangeQuery();
        String S = "AA";
        int[] P = {1,0};
        int[] Q = {1,1};
        int[] result = {1,1};
        assertEquals(true,Arrays.equals(result, t.solution2(S, P, Q)));
    }

}