package daily_problems;

import com.sun.tools.javac.util.List;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

public class TwoSumTest {

    TwoSum twoSum = new TwoSum();

    @Test
    public void hasTwoSumreturnsTrueIfSumExists() {
        List<Integer> integers = List.of(10, 15, 3, 7);
        int target = 17;

        Assert.assertTrue(twoSum.hasTwoSum(integers, target));
    }

    @Test
    public void hasTwoSumreturnsFalseIfSumDoesNotExist() {
        List<Integer> integers = List.of(10, 15, 3, 7);
        int target = 19;

        Assert.assertFalse(twoSum.hasTwoSum(integers, target));
    }

    @Test
    public void hasTwoSumHandlesDuplicateIntegers() {
        List<Integer> integers = List.of(10, 15, 15, 3, 7, 3, 7);
        int target = 17;

        Assert.assertTrue(twoSum.hasTwoSum(integers, target));
    }

    @Test
    public void hasTwoSumHandlesNegativeTarget() {
        List<Integer> integers = List.of(10, -19, 15, 2);
        int target = -17;

        Assert.assertTrue(twoSum.hasTwoSum(integers, target));
    }

    @Test
    public void hasTwoSumReturnsFalseIfEmptyList() {
        java.util.List<Integer> integers = Collections.emptyList();
        int target = 19;

        Assert.assertFalse(twoSum.hasTwoSum(integers, target));
    }

    @Test
    public void hasTwoSumConstantSpaceReturnsTrueIfSumExists() {
        int[] integers = new int[]{10,5,3,7};

        Assert.assertTrue(twoSum.hasTwoSumConstantSpace(integers, 17));
        Assert.assertFalse(twoSum.hasTwoSumConstantSpace(integers, 19));
    }
}
