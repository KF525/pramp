package daily_problems;

import org.junit.Assert;
import org.junit.Test;

public class GettingDifferentNumberTest {

    GettingDifferentNumber gettingDifferentNumber = new GettingDifferentNumber();

    @Test
    public void getDifferentNumberReturnsLowestNonNegativeIntegerNotInArray() {
        Assert.assertEquals(1, gettingDifferentNumber.getDifferentNumber(new int[]{0}));
        Assert.assertEquals(3, gettingDifferentNumber.getDifferentNumber(new int[]{1,2,0}));
        Assert.assertEquals(4, gettingDifferentNumber.getDifferentNumber(new int[]{1,3,2,0}));
        Assert.assertEquals(0, gettingDifferentNumber.getDifferentNumber(new int[]{100000}));
        Assert.assertEquals(2, gettingDifferentNumber.getDifferentNumber(new int[]{1,0,3,4,5}));
        Assert.assertEquals(1, gettingDifferentNumber.getDifferentNumber(new int[]{1000000,0}));
        Assert.assertEquals(7, gettingDifferentNumber.getDifferentNumber(new int[]{0,5,4,1,3,2,6}));
//        Assert.assertEquals(gettingDifferentNumber.getDifferentNumber());
//        Assert.assertEquals(gettingDifferentNumber.getDifferentNumber());
    }
}
