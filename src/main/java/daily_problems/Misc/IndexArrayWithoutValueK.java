package daily_problems.Misc;

/*

Given an array nums and a value val, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example 1:

Given nums = [3,2,2,3], val = 3,

Your function should return length = 2, with the first two elements of nums being 2.

It doesn't matter what you leave beyond the returned length.

     //start = 0
     //end = 3

     if both start and end == value
      end--
     if start == value and end != value
      swap
      end--
      start++
     if start != value and end !=value
      start++

    */

public class IndexArrayWithoutValueK {
    int indexWithoutValue(int[] arr, int value) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] == value && arr[end] == value) {
                end--;
            } else if (arr[start] == value) {
                swap(arr, start, end);
                end--;
                start++;
            } else if (start != value && end != value) {
                start++;
            } else {
                start++;
                end--;
            }
        }

        if (arr[start] == value) {
            return start - 1;
        } else {
            return start;
        }
    }

    /*
    [i] = 11101
    [j] = 10110

    [i] = 01011
    [j] = 11101
    [i] = 10110
    */
    void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
