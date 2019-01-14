package sessions;

import java.util.*;

public class ArrayQuadruplet {

    public List<Integer> findArrayQuadruplet(int[] input, int target) {
      Arrays.sort(input); //sort list

      // TODO: Complete
        return null;
    }

    public List<Integer> findArrayPair(int[] input, int target) {
        Arrays.sort(input);
        List<Integer> pair = new ArrayList<>();
        int start = 0;
        int end = input.length - 1;

        while (start <= end && pair.isEmpty()) {
            int total = input[start] + input[end];
            if (total < target) {
                start = start + 1;
            } else if (total > target) {
                end = end - 1;
            } else {
                pair.add(input[end]);
                pair.add(input[start]);
            }
        }
        return pair;
    }

    public List<Integer> findArrayPairWithSet(int[] input, int target) {
        Set<Integer> remainder = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int i: input) {
            if (remainder.contains(i)) {
                result.add(target-i);
                result.add(i);
                return result;
            } else {
                remainder.add(target - i);
            }
        }

        return result;
    }

}
