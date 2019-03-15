package daily_problems.Problem37;

import daily_problems.Problem37.PowerSet;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PowerSetTest {

    PowerSet powerSet = new PowerSet();

    @Test
    public void createPowerSetReturnsAllSubSets() {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        List<Integer> expectedArray = new ArrayList<>();
        expectedArray.add(2);
        List<List<Integer>> subsets = powerSet.createPowerSets(input, 0);
        Assert.assertEquals(4, subsets.size());
        Assert.assertEquals(expectedArray, subsets.get(1));
        expectedArray.add(1);
        Assert.assertEquals(expectedArray, subsets.get(3));
    }
}
