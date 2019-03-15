package daily_problems.Problem49;

public class ContinguousMaxSum {
/*
Given an array of numbers, find the maximum sum of any contiguous subarray of the array.

For example, given the array [34, -50, 42, 14, -5, 86], the maximum sum would be 137, since we would take elements 42, 14, -5, and 86.

Given the array [-5, -1, -8, -9], the maximum sum would be 0, since we would not take any elements.

Do this in O(N) time.
 */
    public int getMaxSumInefficient(int[] nums) {
        int max = 0;

        for (int i=0; i < nums.length; i++) {
            for (int j=i; j < nums.length; j++) {
                int sum = getMaxSumHelper(nums, i, j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    public int getMaxSumHelper(int[] nums, int i, int j) {
        int sum = 0;
        for (int a = i; i <= j; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }

    public int getMaxSumEfficient(int[] nums) {
        int max = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum < 0) {
                sum = 0;
            } else {
                if (sum > max) {
                    max = sum;
                }
            }
        }

        return max;
    }
}

//Do this in O(n)
//sum = sum + nums[i]
//if sum is negative
//then we want to set sum back to 0
//if sum is not negative
//we want to do a comparison with max
//reassign as needed, and keep going