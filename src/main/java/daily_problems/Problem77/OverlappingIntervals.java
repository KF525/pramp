package daily_problems.Problem77;

import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OverlappingIntervals {
    /*
    Given a list of possibly overlapping intervals, return a new list of intervals where all overlapping intervals have been merged.

    The input list is not necessarily ordered in any way.

    For example, given [(1, 3), (5, 8), (4, 10), (20, 25)], you should return [(1, 3), (4, 10), (20, 25)].
     */

    List<List<Integer>> getIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> result = new ArrayList<>();

        int currentIndex = 0;
        while (currentIndex < intervals.length) {
            if (result.isEmpty()) {
                addInterval(intervals, result, intervals[currentIndex][0], intervals[currentIndex][1]);
                currentIndex++;
            } else if (result.get(result.size() - 1).get(1) < intervals[currentIndex][0]) {
                addInterval(intervals, result, intervals[currentIndex][0], intervals[currentIndex][1]);
                currentIndex++;
            } else {
                if (result.get(result.size() - 1).get(1) < intervals[currentIndex][1]) {
                    List<Integer> interval = new ArrayList<>();
                    interval.add(0, result.get(result.size() - 1).get(0));
                    interval.add(1, intervals[currentIndex + 1][1]);
                    result.add(intervals.length - 1, interval);
                }
                currentIndex++;
            }
        }
        return result;
    }

    public void addInterval(int[][] intervals, List<List<Integer>> result, int start, int end) {
        List<Integer> interval = new ArrayList<>();
        interval.add(0, start);
        interval.add(1, end);
        result.add(interval);
    }
}
