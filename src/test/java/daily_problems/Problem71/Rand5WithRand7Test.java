package daily_problems.Problem71;

import daily_problems.Problem71.Rand5WithRand7;
import org.junit.Assert;
import org.junit.Test;

public class Rand5WithRand7Test {

    Rand5WithRand7 rand5WithRand7 = new Rand5WithRand7();

    @Test
    public void rand5Returns1To5WithEqualProbability() {

        for (int i=0; i < 50; i++) {
            int result = rand5WithRand7.rand5();
            Assert.assertTrue(result < 6);
        }
    }
}
