package daily_problems.Problem49;

import daily_problems.Problem49.MaxSumContiguous;
import org.junit.Assert;
import org.junit.Test;

public class MaxSumContiguousTest {

    MaxSumContiguous maxSumContiguous = new MaxSumContiguous();

    @Test
    public void maxSumReturnsHighestContiguousSumInArray() {
        int[] input = new int[]{34, -50,42,14,-5,86};
        Assert.assertEquals(137, maxSumContiguous.maxSum(input));

    }

    @Test
    public void maxSumShouldReturn0IfOnlyNegativesInArray() {
        int[] input = new int[]{-1, -5,-10, -1};
        Assert.assertEquals(0, maxSumContiguous.maxSum(input));
    }
}
