package daily_problems;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class LevNetwordSizeTest {

    LevNetworkSize levNetworkSize = new LevNetworkSize();

    @Test
    public void levNetworkSizeReturnsCorrectCount() {
        ArrayList<String> sampleDict = new ArrayList<String>(
                Arrays.asList("Bar", "Bat", "Baz",
                        "Car", "Cat", "Cart",
                        "Eel", "Foo", "Hat",
                        "Hovercraft", "Part", "Pat"));
        Assert.assertEquals(9, levNetworkSize.levNetworkSize(sampleDict, "mar"));
        Assert.assertEquals(0, levNetworkSize.levNetworkSize(sampleDict, "invalid"));
        Assert.assertEquals(1, levNetworkSize.levNetworkSize(sampleDict, "Feo"));
        Assert.assertEquals(9, levNetworkSize.levNetworkSize(sampleDict, "Tart"));
    }

    @Test
    public void isEditDistanceOneAwayReturnsTrueIfOneOrLess() {
        Assert.assertTrue(levNetworkSize.isEditDistanceOneAway("Bar", "Bar"));
        Assert.assertTrue(levNetworkSize.isEditDistanceOneAway("Bar", "Bat"));
        Assert.assertTrue(levNetworkSize.isEditDistanceOneAway("Bart", "Bat"));
    }

    @Test
    public void isEditDistanceOneAwayReturnsFalseIfMoreThanOne() {
        Assert.assertFalse(levNetworkSize.isEditDistanceOneAway("Bar", "Bath"));
    }


}
