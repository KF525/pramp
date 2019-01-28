package daily_problems;

public class MaxSumContiguous {
    public int maxSum(int[] array) {
        int highestMax = 0;

        for (int i=0; i < array.length; i++) {
            if (array[i] + highestMax < 0) {
                highestMax = 0;
            } else {
                highestMax += array[i];
            }
        }

        return highestMax;
    }
}
