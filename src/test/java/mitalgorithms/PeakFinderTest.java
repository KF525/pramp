package mitalgorithms;

import com.sun.tools.javac.util.List;
import org.junit.Assert;
import org.junit.Test;

public class PeakFinderTest {

    PeakFinder peakFinder = new PeakFinder();

    @Test
    public void oneDimensionalPeakFinderReturnsIndexOfPeak() {
        List<Integer> numbers1 = List.of(1,2,3,4,6,5,7);
        Assert.assertEquals(4, peakFinder.oneDimensionalPeakFinder(numbers1));

        List<Integer> numbers2 = List.of(1,2,3,4,5,6,7);
        Assert.assertEquals(6, peakFinder.oneDimensionalPeakFinder(numbers2));

        List<Integer> numbers3 = List.of(8,3,2, 1);
        Assert.assertEquals(0, peakFinder.oneDimensionalPeakFinder(numbers3));
    }

    @Test
    public void oneDimentionalPeakFinderReturnsIndexOfPeak2() {
        int[] numbers1 = new int[]{1,2,3,4,6,5,7};
        Assert.assertEquals(4, peakFinder.oneDimensionalPeakFinder(numbers1));

        int[] numbers2 = new int[]{1,2,3,4,5,6,7};
        Assert.assertEquals(6, peakFinder.oneDimensionalPeakFinder(numbers2));

        int[] numbers3 = new int[]{8,3,2,1};
        Assert.assertEquals(0, peakFinder.oneDimensionalPeakFinder(numbers3));
    }
}
