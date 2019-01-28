package daily_problems;

public class MaxSubArrayOfLengthK {

    public int[] maxSubArray(int[] array, int k) {
        int[] result = new int[array.length - k + 1];
        for (int i = 0; i < array.length - k + 1; i++) {
            int max = getMaxValue(array, i, i+k, Integer.MIN_VALUE);
            result[i] = max;
        }
        return result;
    }

    public int getMaxValue(int[] array, int start, int stop, int currentMax) {
       if (start==stop) return currentMax;
       return getMaxValue(array, start+1, stop, Math.max(array[start], currentMax));
    }
}

/*
[10,5,2,7,8,7], k=3 => [10. 7,8,8]
 */