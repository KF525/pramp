package daily_problems;

import org.junit.Assert;
import org.junit.Test;

public class LargestStackTest {

    LargestStack largestStack = new LargestStack();

    @Test
    public void getMaxReturnsCurrentMaxValueInStack() {
        largestStack.push(5);
        Assert.assertEquals(5, largestStack.getMax());
        largestStack.push(3);
        Assert.assertEquals(5, largestStack.getMax());
        largestStack.push(6);
        Assert.assertEquals(6, largestStack.getMax());
        largestStack.pop();
        Assert.assertEquals(5, largestStack.getMax());
    }
}
