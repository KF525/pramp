package sessions;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfPathsTest {

    NumberOfPaths numberOfPaths = new NumberOfPaths();

    @Test
    public void returnNumberOfPathsBruteForceReturnsCorrectNumber() {
        Assert.assertEquals(5, numberOfPaths.returnNumberOfPathsBruteForce(0,0, 4));
    }

    @Test
    public void returnNumberOfPathsWithStoreReturnsCorrectNumber() {
        Assert.assertEquals(5, numberOfPaths.returnNumberOfPathsWithStore(0,0, 4));
    }

    @Test
    public void returnNumberOfPathsDynamicallyReturnsCorrectNumber() {
        Assert.assertEquals(5, numberOfPaths.returnNumberOfPathsWithStoreDynamically(4));
    }
}
