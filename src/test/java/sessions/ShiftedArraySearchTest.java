package sessions;

import org.junit.Assert;
import org.junit.Test;

public class ShiftedArraySearchTest {

    ShiftedArraySearch shiftedArraySearch = new ShiftedArraySearch();

    @Test
    public void shiftedArraySearchReturnsIndexOfNum() {
        int[] arr1 = new int[]{9, 12, 17, 2, 4, 5};
        int num1 = 2;

        int[] arr2 = new int[]{2};
        int num2 = 2; //expect 0

        int[] arr3 = new int[]{1,2,3,4,5,0};
        int num3 = 0; //expect 5

        int[] arr4 = new int[]{9, 12, 17, 2, 4, 5};
        int num4 = 17;

        int[] arr5 = new int[]{9, 12, 17, 2, 4, 5, 6};
        int num5 = 4;

        int[] arr6 = new int[]{1,2};
        int num6 = 2; //expect 1

        int[] arr7 = new int[]{0,1,2,3,4,5};
        int num7 = 1;

        Assert.assertEquals(3, shiftedArraySearch.shiftedArraySearch(arr1, num1));
        Assert.assertEquals(0, shiftedArraySearch.shiftedArraySearch(arr2, num2));
        Assert.assertEquals(5, shiftedArraySearch.shiftedArraySearch(arr3, num3));
        Assert.assertEquals(2, shiftedArraySearch.shiftedArraySearch(arr4, num4));
        Assert.assertEquals(4, shiftedArraySearch.shiftedArraySearch(arr5, num5));
        Assert.assertEquals(1, shiftedArraySearch.shiftedArraySearch(arr6, num6));
        Assert.assertEquals(1, shiftedArraySearch.shiftedArraySearch(arr7, num7));
    }
}
