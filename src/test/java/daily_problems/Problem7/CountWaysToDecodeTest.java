package daily_problems.Problem7;

import daily_problems.Problem7.CountWaysToDecode;
import org.junit.Assert;
import org.junit.Test;

public class CountWaysToDecodeTest {

    CountWaysToDecode countWaysToDecode = new CountWaysToDecode();

    @Test
    public void countDecodesReturnsCountOfPossibleWaysToDecode() {
        String input1 = "11"; //1,1  11
        String input2 = "123"; // 1,2,3  12,3  1,23
        String input3 = "2627"; // 26,2,7  2,6,2,7

        Assert.assertEquals(2, countWaysToDecode.countDecodes(input1));
        Assert.assertEquals(3, countWaysToDecode.countDecodes(input2));
        Assert.assertEquals(2, countWaysToDecode.countDecodes(input3));
    }
}
