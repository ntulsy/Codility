package codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaterpillarTest {
    @Test
    public void test() throws Exception {
        Caterpillar t = new Caterpillar();
        int[] A = {6, 2, 7, 4, 0, 3, 6};
        int s = 12;
        assertEquals(false, t.CaterpillarMethod(A, s));

    }
    @Test
    public void test2() throws Exception {
        Caterpillar t = new Caterpillar();
        int[] A = {5, 2, 7, 4, 0, 3, 6};
        int s = 6;
        assertEquals(true, t.CaterpillarMethod(A, s));

    }
    @Test
    public void test3() throws Exception {
        Caterpillar t = new Caterpillar();
        int[] A = {6, 2, 7, 4, 0, 3, 15};
        int s = 15;
        assertEquals(true, t.CaterpillarMethod(A, s));

    }


}