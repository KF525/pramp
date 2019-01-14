package daily_problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoSum {

    public boolean hasTwoSum(List<Integer> integers, int target) {
        Set<Integer> integerNeeded = new HashSet<>();

        for (Integer integer: integers) {
            if (integerNeeded.contains(integer)) {
                return true;
            }
            integerNeeded.add(target - integer);
        }

        return false;
    }

    public boolean hasTwoSumConstantSpace(int[] integers, int target) {
        Arrays.sort(integers);
        int start = 0;
        int end = integers.length - 1;

        while (end > start) {
            int total = integers[start] + integers[end];
        if (total == target) {
            return true;
        } else if (total < target) {
            start = start + 1;
        } else {
            end = end + 1;
        }
    }
        return false;
    }
}
