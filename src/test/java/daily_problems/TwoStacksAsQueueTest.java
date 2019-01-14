package daily_problems;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TwoStacksAsQueueTest {
    TwoStacksAsQueue twoStacksAsQueue;

    @Before
    public void before() {
        twoStacksAsQueue = new TwoStacksAsQueue();
    }

    @Test
    public void pushAddsToTheStack() {
        twoStacksAsQueue.enqueue(3);
        Assert.assertEquals(1, (long) twoStacksAsQueue.enqueueStack.size());
        twoStacksAsQueue.enqueue(6);
        twoStacksAsQueue.enqueue(9);
        Assert.assertEquals(3, (long) twoStacksAsQueue.enqueueStack.size());
    }

    @Test
    public void popRemovesItemsFromTheStack() {
        twoStacksAsQueue.enqueue(3);
        Assert.assertEquals(3, (long) twoStacksAsQueue.dequeue());
        twoStacksAsQueue.enqueue(6);
        twoStacksAsQueue.enqueue(9);
        Assert.assertEquals(2, (long) twoStacksAsQueue.enqueueStack.size());
        Assert.assertEquals(6, (long) twoStacksAsQueue.dequeue());
        Assert.assertEquals(1, twoStacksAsQueue.dequeueStack.size());
        Assert.assertEquals(0, twoStacksAsQueue.enqueueStack.size());
    }

    @Test
    public void peekShowsCurrentTopElement() {
        twoStacksAsQueue.enqueue(3);
        twoStacksAsQueue.enqueue(6);
        Assert.assertEquals(3, (long) twoStacksAsQueue.peek());
        twoStacksAsQueue.enqueue(9);
        Assert.assertEquals(3, (long) twoStacksAsQueue.peek());
        twoStacksAsQueue.dequeue();
        twoStacksAsQueue.dequeue();
        Assert.assertEquals(9, (long) twoStacksAsQueue.peek());
    }
}
