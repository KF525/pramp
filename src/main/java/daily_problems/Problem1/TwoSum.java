package daily_problems.Problem1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoSum {
    /*
    Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

    For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

    Bonus: Can you do this in one pass?
    */

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
