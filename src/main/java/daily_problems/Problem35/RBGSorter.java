package daily_problems.Problem35;

import java.util.List;

public class RBGSorter {
/*
Given an array of strictly the characters 'R', 'G', and 'B', segregate the values of the array so that all the Rs come first, the Gs come second, and the Bs come last. You can only swap elements of the array.

Do this in linear time and in-place.

For example, given the array ['G', 'B', 'R', 'R', 'B', 'R', 'G'], it should become ['R', 'R', 'R', 'G', 'G', 'B', 'B'].
 */
    public List<Character> sort(List<Character> colors) {
        return sortHelper(colors, 0, 1, colors.size()-1);
    }

    public List<Character> sortHelper(List<Character> colors, int start, int middle, int end) {
        if (middle >= end) { //we have gone through the entire list
            return colors;
        } else if (colors.get(middle) == 'B') {
            return sortHelper(colors, start, middle + 1, end);
        } else if (colors.get(middle) == 'G') {
            Character tempColor = colors.get(start);
            colors.set(start, 'G');
            colors.set(middle, tempColor);
            return sortHelper(colors, start + 1, middle, end);
        } else {
            Character tempColor = colors.get(end);
            colors.set(end, 'R');
            colors.set(middle, tempColor);
            return sortHelper(colors, start, middle, end - 1);
        }
    }
}
