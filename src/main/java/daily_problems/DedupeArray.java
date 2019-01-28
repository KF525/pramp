package daily_problems;

import java.util.Arrays;

public class DedupeArray {
    /**
     * Input parameter 'list' is unsorted and might contain duplicates. This function ensures the unique N elements within 'list' are arranged from index 0..N-1 and it returns index N-1 (the index, not the value at N-1).
     *
     * NOTE: The implementaion should NOT allocate a second container or array.
     *
     * Example
     *     Input: {1,3,2,1,3,5}. This contains 2 duplicates: 1 and 3.
     *
     *     After unique() executes:
     *         1) the 4 unique elements reside in indexes 0..3 (no specific order is required, and an example might be: 1,3,2,5
     *         2) the function returns 3 (the last index of the unique elements)
     *
     * @param list
     *            An array of Comparables that might contain duplicates.
     * @return
     *            The index of the last unique element in the array.
     *
     */
     <T extends Comparable<T>> int unique(T list[] ) {
        if (list.length == 0) return -1;
        if (list.length == 1) return 0;

        Arrays.sort(list);

        int knownUnique = 0;
        int i = 1;

        while (i < list.length) {
            if (list[knownUnique].compareTo(list[i]) == 0) { //if they are equal then we have duplicate
                i++;
            } else { //both are unique swap and keep going

                //TODO: break this swap into separate method
                T tmp = list[knownUnique + 1];
                list[knownUnique + 1] = list[i];
                list[i] = tmp;

                knownUnique++;
                i++;
            }
        }
        return knownUnique;
    }
}
