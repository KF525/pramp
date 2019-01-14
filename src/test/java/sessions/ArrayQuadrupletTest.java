package sessions;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ArrayQuadrupletTest {

    ArrayQuadruplet arrayQuadruplet = new ArrayQuadruplet();

    @Test
    public void findArrayPairReturnsPairWithSetThatSumToTarget() {
        int[] ints = new int[]{4,2,11,17,3,4,19};
        List<Integer> result = arrayQuadruplet.findArrayPairWithSet(ints, 14);
        Assert.assertEquals(2, result.size());
        Assert.assertEquals(11, (long) result.get(0));
        Assert.assertEquals(3, (long) result.get(1));
    }

    @Test
    public void findArrayPairReturnsPairThatSumToTarget() {
        int[] ints = new int[]{4,2,11,17,3,4,19};
        List<Integer> result = arrayQuadruplet.findArrayPair(ints, 14);
        Assert.assertEquals(2, result.size());
        Assert.assertEquals(11, (long) result.get(0));
        Assert.assertEquals(3, (long) result.get(1));
    }

    @Test
    public void findArrayPairReturnsEmptyListWhenNoPairSumsToTarget() {
        int[] ints = new int[]{4,2,11,17,3,4,19};
        List<Integer> result1 = arrayQuadruplet.findArrayPair(ints, 16);
        List<Integer> result2 = arrayQuadruplet.findArrayPairWithSet(ints, 16);
        Assert.assertTrue(result1.isEmpty());
        Assert.assertTrue(result2.isEmpty());
    }
}
