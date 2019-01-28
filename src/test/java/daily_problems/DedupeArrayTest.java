package daily_problems;

import org.junit.Assert;
import org.junit.Test;

public class DedupeArrayTest {

    DedupeArray dedupeArray = new DedupeArray();

    @Test
    public void dedupe() {
        Integer[] list = {1,2};
        Assert.assertEquals(1, dedupeArray.unique(list));

        Integer[] list2 = {2,1,1,3,1,2};
        Assert.assertEquals(2, dedupeArray.unique(list2));

        Integer[] list3 = {};
        Assert.assertEquals(-1, dedupeArray.unique(list3));

        Integer[] list4 = {1};
        Assert.assertEquals(0, dedupeArray.unique(list4));

        Integer[] list5 = {1,6,3,5,4,2};
        Assert.assertEquals(5, dedupeArray.unique(list5));

        Integer[] list6 = {1,1,1,1,1,1};
        Assert.assertEquals(0, dedupeArray.unique(list6));
        }
}

