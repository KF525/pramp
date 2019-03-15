package daily_problems.Problem77;

import junit.framework.Assert;
import org.junit.Test;

import java.util.List;

public class OverlappingIntervalsTest {

    OverlappingIntervals overlappingIntervals = new OverlappingIntervals();

    @Test
    public void getIntervalsReturnsMergedIntervals() {
        int[][] intervals = {{1, 3}, {5, 8}, {4, 10}, {20, 25}};
        List<List<Integer>> result = overlappingIntervals.getIntervals(intervals);

        Assert.assertEquals(3, result.size());
    }
}
