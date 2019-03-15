package daily_problems.Problem31;

import daily_problems.Problem31.EditDistance;
import org.junit.Assert;
import org.junit.Test;

public class EditDistanceTest {

    EditDistance editDistance = new EditDistance();

    @Test
    public void countEditDistanceReturns0WhenWordsEquivalent() {
        String w1 = "ink";
        String w2 = "ink";

        Assert.assertEquals(0, editDistance.countEditDistance(0, w1, w2));
    }

    @Test
    public void countEditDistanceReturnsEditDistanceBetweenTwoStrings() {
        String w1 = "ink";
        String w2 = "pink";

        Assert.assertEquals(1, editDistance.countEditDistance(0, w1, w2));

        String w3 = "ink";
        String w4 = "tint";

        Assert.assertEquals(2, editDistance.countEditDistance(0, w3, w4));

        String w5 = "resilience";
        String w6 = "resemble";

        Assert.assertEquals(7, editDistance.countEditDistance(0, w5, w6));

        String w7 = "sitting";
        String w8 = "kitten";

        Assert.assertEquals(3, editDistance.countEditDistance(0, w7, w8));
    }
}
