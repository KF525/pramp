package daily_problems;

import org.junit.Assert;
import org.junit.Test;

public class MissingPositiveIntegerTest {

    MissingPositiveInteger missingPositiveInteger = new MissingPositiveInteger();

    @Test
    public void findFirstPositiveReturnsIndex() {
        int[] input = new int[]{-1,1,3,4};
        Assert.assertEquals(1, missingPositiveInteger.findFirstPositive(input, 0, input.length - 1));

        int[] input2 = new int[]{-6, -3, -1, 2, 6, 10};
        Assert.assertEquals(3, missingPositiveInteger.findFirstPositive(input2, 0, input2.length - 1));
    }

    @Test
    public void returnFirstMissingIntegerReturnsFirstMissingInt() {
        int[] input = new int[]{3,4,-1,1};
        Assert.assertEquals(2,missingPositiveInteger.returnFirstMissingInteger(input));
    }
}
