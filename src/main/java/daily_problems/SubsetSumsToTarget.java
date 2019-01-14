package daily_problems;

import java.util.ArrayList;
import java.util.List;

public class SubsetSumsToTarget {

    public boolean getSubset(int[] list, int target) {
        List<Integer> subset = new ArrayList<>();
        return isSubsetSum(list, target, 0);
        //return getSubsetHelper(list, target, 0, 0, subset);
        //return getSubsetHelper2(list, 0, target, 0, subset);
    }

    public boolean isSubsetSum(int set[],
                               int n, int sum)
    {
        // The value of subset[i][j] will be
        // true if there is a subset of
        // set[0..j-1] with sum equal to i
        boolean subset[][] =
                new boolean[sum+1][n+1];

        // If sum is 0, then answer is true
        for (int i = 0; i <= n; i++)
            subset[0][i] = true;

        // If sum is not 0 and set is empty,
        // then answer is false
        for (int i = 1; i <= sum; i++)
            subset[i][0] = false;

        // Fill the subset table in botton
        // up manner
        for (int i = 1; i <= sum; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                subset[i][j] = subset[i][j-1];
                if (i >= set[j-1])
                    subset[i][j] = subset[i][j] ||
                            subset[i - set[j-1]][j-1];
            }
        }

        /* // uncomment this code to print table
           for (int i = 0; i <= sum; i++)
        {
        for (int j = 0; j <= n; j++)
            System.out.println (subset[i][j]);
        } */

        return subset[sum][n];
    }

//    private List<Integer> getSubsetHelper(int[] list, int target, int i, int sum, List<Integer> subset) {
//
//        if (i >= list.length) {
//            if (sum == target) {
//                return subset;
//            } else {
//                return null;
//            }
//        }
//
//        List<Integer> exclusive = getSubsetHelper(list, target, i + 1, sum, subset);
//        subset.add(list[i]);
//        List<Integer> inclusive = getSubsetHelper(list, target, i + 1, sum + list[i], subset);
//
//        if (exclusive.isEmpty()) {
//            return inclusive;
//        } else {
//            return exclusive;
//        }
//    }
//
//
//    public List<Integer> getSubsetHelper2(int[] set, int index, int target, int sum, List<Integer> subset) {
//        if (sum == target) {
//            return subset;
//        }
//
//        if (index > set.length) {
//            return null;
//        }
//
//        if (set[index] > sum) {
//            return getSubsetHelper2(set,index + 1, target, sum, subset);
//        }
//
//        List<Integer> exclusive = getSubsetHelper2(set, index + 1, target, sum, subset);
//
//        subset.add(set[index]);
//        List<Integer> inclusive = getSubsetHelper2(set, index + 1,target, sum + set[index], subset);
//
//        if (exclusive == null) {
//            return inclusive;
//        } else {
//            return exclusive;
//        }
//    }
//

//    public boolean isSubsetSumRecursive(int[] set, int n, int sum) {
//        if (sum == 0) {
//            return true;
//        }
//
//        if (n == 0 && sum != 0) {
//            return false;
//        }
//
//        if (set[n-1] > sum) { //if last element is greater than sum, ignore it
//            return isSubsetSumRecursive(set, n-1, sum);
//        }
//
//        //including and excluding the last element
//        return isSubsetSumRecursive(set, n-1, sum) || isSubsetSumRecursive(set, n-1, sum-set[n-1]);
//    }
//

}
