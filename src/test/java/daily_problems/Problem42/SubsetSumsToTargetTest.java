package daily_problems.Problem42;

import daily_problems.Problem42.SubsetSumsToTarget;
import org.junit.Test;

public class SubsetSumsToTargetTest {

    SubsetSumsToTarget subsetSumsToTarget = new SubsetSumsToTarget();

    @Test
    public void getSubsetReturnsSubsetThatSumsToTarget() {
        int[] list = new int[]{12, 1, 61, 5, 9, 2};

        System.out.print(subsetSumsToTarget.isSubsetSum(list, 24, 0));
    }
}
