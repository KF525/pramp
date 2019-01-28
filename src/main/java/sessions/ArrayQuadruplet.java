package sessions;

import java.util.*;

public class ArrayQuadruplet {

    public int[] findArrayQuadruplet(int[] input, int target) {
        int length = input.length;
        int[] result = new int[4];

        if (length < 4) {
            return null;
        }

        Arrays.sort(input); //sort list

        for (int i = 0; i <= length - 4; i++) {
            for (int j = i + 1; j <= length - 3; j++) {
                int remainder = target - (input[i] + input[j]);
                int low = j + 1;
                int high = length - 1;

                while (low < high) {
                    if (input[low] + input[high] < remainder) {
                        low++;
                    } else if (input[low] + input[high] > remainder) {
                        high--;
                    } else {
                        result[0] = input[i];
                        result[1] = input[j];
                        result[2] = input[low];
                        result[3] = input[high];
                        return result;
                    }
                }
            }

        }
        return result;
    }
}
