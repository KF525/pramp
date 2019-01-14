package daily_problems;

public class ContinguousMaxSum {

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