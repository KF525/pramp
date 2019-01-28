package daily_problems;

import org.junit.Assert;
import org.junit.Test;

public class MaxSubArrayOfLengthKTest {

    MaxSubArrayOfLengthK maxSubArrayOfLengthK = new MaxSubArrayOfLengthK();

    @Test
    public void maxSubArrayReturnsCorrectArray() {
        int[] input = new int[]{10,5,2,7,8,7};
        int[] result = maxSubArrayOfLengthK.maxSubArray(input, 3);
        Assert.assertEquals(10, result[0]);
        Assert.assertEquals(7, result[1]);
        Assert.assertEquals(8, result[2]);
        Assert.assertEquals(8, result[3]);
    }
}
