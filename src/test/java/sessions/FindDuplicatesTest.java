package sessions;

import org.junit.Assert;
import org.junit.Test;

public class FindDuplicatesTest {

    FindDuplicates findDuplicates = new FindDuplicates();

    @Test
    public void findDuplicatesReturnsAllDuplicates() {
        int[] arr1 = new int[]{1,2,3,5,6,7};
        int[] arr2 = new int[]{3,6,7,8,20};
        int[] expected = new int[]{3,6,7};
        Assert.assertArrayEquals(expected, findDuplicates.findDuplicates(arr1, arr2));
    }

    @Test
    public void findDuplicatesHandlesEmptyArrays() {
        int[] arr1 = new int[]{};
        int[] arr2 = new int[]{3,6,7,8,20};
        int[] expected = new int[]{};
        Assert.assertArrayEquals(expected, findDuplicates.findDuplicates(arr1, arr2));
    }
}
