package daily_problems;

import java.util.Arrays;

public class MissingPositiveInteger {
/*
Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.
 */
    public int returnFirstMissingInteger(int[] array) {
        Arrays.sort(array);
        int index = findFirstPositive(array, 0, array.length - 1); //use binary search to find positive numbers?

        if (index == -1) {
            return 0;
        }

        for (int i = index + 1; i < array.length; i++) {   //then linear from there to find missing positive number?
            //compare i to i - 1
            if (array[i] - array[i-1] > 1) { //it either has no difference or a difference of 1 to be valid
                return array[i - 1] + 1; //if it is more than 1 than array[i - 1] + 1 is the first missing positive
            }
        }

        return 0;
    }

    public int findFirstPositive(int[] array, int start, int end) {
        if (start > end) {
            return -1;
        }

        int midpoint = (start + end)/2;

        if (array[midpoint] < 0) {
            return findFirstPositive(array, midpoint, end);
        } else {
            if (array[midpoint - 1] < 0) return midpoint;
            return findFirstPositive(array, start, midpoint);
        }
    }
}
