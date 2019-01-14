package daily_problems;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MaxSumNonAdjacentsTest {

    MaxSumNonAdjacents maxSumNonAdjacents = new MaxSumNonAdjacents();

    @Test
    public void returnMaxSumReturnsMaxSum() {
        List<Integer> nums = com.sun.tools.javac.util.List.of(4,1, 1,4, 2, 1);
        Assert.assertEquals(9, maxSumNonAdjacents.returnMaxSum(nums));
    }
}
