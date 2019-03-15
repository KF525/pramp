package daily_problems.Problem69;

import daily_problems.Problem69.LargestProductOfThree;
import junit.framework.Assert;
import org.junit.Test;

public class LargestProductOfThreeTest {

    LargestProductOfThree largestProductOfThree = new LargestProductOfThree();

    @Test
    public void largestProductReturnsCorrectValue() {
        int[] arr = {-10, -10, 5, 2};
        Assert.assertEquals(500, largestProductOfThree.largestProduct(arr));

        int[] arr2 = {-10, 6, 5, 1, 3};
        Assert.assertEquals(90, largestProductOfThree.largestProduct(arr2));

        int[] arr3 = {-10, 5, 6};
        Assert.assertEquals(-300, largestProductOfThree.largestProduct(arr3));
    }
}
