package daily_problems;

import org.junit.Assert;
import org.junit.Test;

public class ArrayInversionsTest {

    ArrayInversions arrayInversions = new ArrayInversions();

    @Test
    public void countInversionsReturnsCorrectCount() {
        int[] array1 = new int[]{2,4,1,3,5};
        int[] array2 = new int[]{5,4,3,2,1};

        Assert.assertEquals(3, arrayInversions.countInversions(array1));
        Assert.assertEquals(10, arrayInversions.countInversions(array2));
    }
}
