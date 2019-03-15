package daily_problems.Problem61;


import daily_problems.Problem61.IntegerExponentiation;
import junit.framework.Assert;
import org.junit.Test;

public class IntegerExponentiationTest {

    IntegerExponentiation integerExponentiation = new IntegerExponentiation();

    @Test
    public void powShouldReturnCorrectExponent() {
        Assert.assertEquals(1024, integerExponentiation.pow(2,10));
    }
}
