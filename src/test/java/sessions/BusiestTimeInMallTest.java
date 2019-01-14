package sessions;

import org.junit.Assert;
import org.junit.Test;

public class BusiestTimeInMallTest {

    BusiestTimeInMall busiestTimeInMall = new BusiestTimeInMall();

    @Test
    public void returnTimestampOfBusiestTimeReturnsCorrectTimestamp() {
        int[][] data = new int[][]{
                new int[]{1487799425, 14, 1},
                new int[]{1487799425, 4,  0},
                new int[]{1487799425, 2,  0},
                new int[]{1487800378, 10, 1},
                new int[]{1487801478, 18, 0},
                new int[]{1487801478, 18, 1},
                new int[]{1487901013, 1,  0},
                new int[]{1487901211, 7,  1},
                new int[]{1487901211, 7,  0}
        };

        Assert.assertEquals(1487800378, busiestTimeInMall.returnTimestampOfBusiestTime(data));
    }
}
