package daily_problems;

import java.util.Arrays;

public class MissingPositiveInteger {
/*
Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.
 */
    public int returnFirstMissingInteger(int[] array) {
        Arrays.sort(array);
        int index = findStartOfPositives(array); //use binary search to find positive numbers?

        for (int i = index + 1; i < array.length; i++) {   //then linear from there to find missing positive number?
            //compare i to i - 1
            //it either has no difference or a difference of 1 to be valid
            //if it is more than 1 than array[i - 1] + 1 is the first missing positive
        }

        return 0;
    }

    public int findStartOfPositives(int[] array) {
        return 0;
    }
}
