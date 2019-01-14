package daily_problems;

import org.junit.Assert;
import org.junit.Test;

public class StackWithMaxTest {

    StackWithMax stackWithMax = new StackWithMax();

    @Test
    public void stackWithMaxHandlesMaxValue() {
        stackWithMax.push(5);
        Assert.assertEquals(5, stackWithMax.max());
        stackWithMax.push(4);
        Assert.assertEquals(5, stackWithMax.max());
        stackWithMax.push(10);
        Assert.assertEquals(10, stackWithMax.max());
        stackWithMax.pop();
        Assert.assertEquals(5, stackWithMax.max());
    }
}
