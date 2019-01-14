package daily_problems;

import java.util.List;

public class RBGSorter {

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
