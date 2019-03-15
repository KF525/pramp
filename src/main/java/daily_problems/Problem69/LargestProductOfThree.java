package daily_problems.Problem69;

import java.util.Arrays;

public class LargestProductOfThree {

    /*
    Given a list of integers, return the largest product that can be made by multiplying any three integers.

    For example, if the list is [-10, -10, 5, 2], we should return 500, since that's -10 * -10 * 5.

    You can assume the list has at least three integers.
     */

    public int largestProduct(int[] arr) {
        Arrays.sort(arr);
        //it will either be the first 2 numbers * the largest or the last 3 numbers
        int largest1 = arr[0] * arr[1] * arr[arr.length - 1];
        int largest2 = arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3];
        return Math.max(largest1, largest2);
    }

}

