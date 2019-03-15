package daily_problems.Misc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GettingDifferentNumber {
    /*
    Given an array arr of unique nonnegative integers, implement a function getDifferentNumber that finds the smallest nonnegative integer that is NOT in the array.

    Even if your programming language of choice doesn’t have that restriction (like Python), assume that the maximum value an integer can have is MAX_INT = 2^31-1. So, for instance, the operation MAX_INT + 1 would be undefined in our case.

    Your algorithm should be efficient, both from a time and a space complexity perspectives.

    Solve first for the case when you’re NOT allowed to modify the input arr. If successful and still have time, see if you can come up with an algorithm with an improved space complexity when modifying arr is allowed. Do so without trading off the time complexity.

    Analyze the time and space complexities of your algorithm.
     */
    int getDifferentNumber(int[] arr) {
        Set<Integer> set = new HashSet();

        for (int i : arr) {
            set.add(i);
        }

        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return arr.length;
    }

    int getDifferentNumberWithModifiedArray(int[] arr) {
        Arrays.sort(arr);

        return 0;
    }
}
