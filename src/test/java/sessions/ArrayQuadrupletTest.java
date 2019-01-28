package sessions;

import org.junit.Assert;
import org.junit.Test;

public class ArrayQuadrupletTest {

    ArrayQuadruplet arrayQuadruplet = new ArrayQuadruplet();

    @Test
    public void findArrayQuadrupletFindsIntegersThatSumToTarget() {
        int[] ints = new int[]{2, 7, 4, 0, 9, 5, 1, 3};
        int[] result = arrayQuadruplet.findArrayQuadruplet(ints, 20);
        Assert.assertEquals(0, result[0]);
        Assert.assertEquals(4, result[1]);
        Assert.assertEquals(7, result[2]);
        Assert.assertEquals(9, result[3]);

        int[] ints2 = new int[]{4,4,4,4};
        int[] result2 = arrayQuadruplet.findArrayQuadruplet(ints2, 16);
        Assert.assertEquals(4, result2[0]);
        Assert.assertEquals(4, result2[1]);
        Assert.assertEquals(4, result2[2]);
        Assert.assertEquals(4, result2[3]);

        int[] ints3 = new int[]{1,2,3,4,5,9,19,12,12,19};
        int[] result3 = arrayQuadruplet.findArrayQuadruplet(ints3, 40);
        Assert.assertEquals(4, result3[0]);
        Assert.assertEquals(5, result3[1]);
        Assert.assertEquals(12, result3[2]);
        Assert.assertEquals(19, result3[3]);
    }

    @Test
    public void findArrayQuadrupletFindsIntegersReturnsNullWhenNoInput() {
        int[] ints = new int[]{1,2,3};
        int[] result = arrayQuadruplet.findArrayQuadruplet(ints, 20);
        Assert.assertNull(result);
    }

    @Test
    public void findArrayQuadrupletFindsIntegersReturnsEmptyArrayWhenNoQuadruplet() {
        int[] ints = new int[]{1,4,2,12,3,10};
        int[] result = arrayQuadruplet.findArrayQuadruplet(ints, 30);
        Assert.assertEquals(0, result[0]);
        Assert.assertEquals(0, result[1]);
        Assert.assertEquals(0, result[2]);
        Assert.assertEquals(0, result[3]);
    }
}
