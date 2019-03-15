package daily_problems.Misc;

import java.util.List;

public class MaxSumNonAdjacents {

    public int returnMaxSum(List<Integer> nums) {
        int exclusive = 0;
        int inclusive = nums.get(0);

        for (int i=1; i < nums.size(); i++) {
            int temp = inclusive;
            inclusive = Math.max(exclusive + nums.get(i), temp);
            exclusive = temp;
        }

        return Math.max(exclusive, inclusive);
    }
}
