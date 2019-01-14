package sessions;

import java.util.List;

public class ArrayIndexAndElementEquality {
    /*
    Given a sorted array of distinct integers write a function indexEqualsValueSearch
    returns the lowest index i for which arr[i] == i. Return -1 if there is no such index.
    */

    public int indexEqualsValueSearch(List<Integer> ints) {
        if (ints.size() == 0) return -1;
        return indexEqualsValueSearchHelper(ints, 0, ints.size() - 1, -1);
    }

    public int indexEqualsValueSearchHelper(List<Integer> ints, int start, int end, int element) {
        int midpoint = (start + end) / 2;

        if (end < start) {
            return element; //went through the whole list and couldn't find an index/element match
        } else if (ints.get(midpoint) == midpoint) {
            return indexEqualsValueSearchHelper(ints, start, midpoint - 1, midpoint);
        } else if (ints.get(midpoint) > midpoint) { //go left
            return indexEqualsValueSearchHelper(ints, start, midpoint - 1, element);
        } else {
            return indexEqualsValueSearchHelper(ints, midpoint + 1, end, element);
        }
    }

    // since it is sorted we can use binary search
    // if index > element => go left
    // if index < element => go right
    // if index == element => that's an option, check if there is a smaller index
}
