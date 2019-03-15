package daily_problems.Problem27;

import daily_problems.Problem27.BalancedBrackets;
import org.junit.Assert;
import org.junit.Test;

public class BalancedBracketsTest {

    BalancedBrackets balancedBrackets = new BalancedBrackets();

    @Test
    public void isBalancedReturnsTrueIfBalanced() {
        Assert.assertTrue(balancedBrackets.isBalanced("([])[]({})"));
    }

    @Test
    public void isBalancedReturnsFalseIfBalanced() {
        Assert.assertFalse(balancedBrackets.isBalanced("([)]"));
        Assert.assertFalse(balancedBrackets.isBalanced("((()"));
    }
}
