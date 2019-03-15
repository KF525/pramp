package daily_problems.Problem70;

import daily_problems.Problem70.PerfectNumber;
import junit.framework.Assert;
import org.junit.Test;

public class PerfectNumberTest {

    PerfectNumber perfectNumber = new PerfectNumber();

    @Test
    public void perfectNumberReturnsNumberThatSumsToTen() {
        Assert.assertEquals(19, perfectNumber.createPerfectNumber(1));
        Assert.assertEquals(28, perfectNumber.createPerfectNumber(2));
        Assert.assertEquals(2341, perfectNumber.createPerfectNumber(234));
        Assert.assertEquals(23410, perfectNumber.createPerfectNumber(2341));
    }

    @Test
    public void perfectNumberReturnsNegativeOneIfMoreThanTen() {
        Assert.assertEquals(-1, perfectNumber.createPerfectNumber(98));
    }
}
