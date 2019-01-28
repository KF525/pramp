package sessions;

import org.junit.Assert;
import org.junit.Test;

public class BracketMatchTest {

    BracketMatch bracketMatch = new BracketMatch();

    @Test
    public void isBalancedReturnsTrueIfBalanced() {
        Assert.assertTrue(bracketMatch.isBalanced("(())()"));
    }

    @Test
    public void isBalancedReturnsFalseIfNotBalanced() {
        Assert.assertFalse(bracketMatch.isBalanced("()())()"));
        Assert.assertFalse(bracketMatch.isBalanced("("));
    }

    @Test
    public void isBalancedHandlesEmptyString() {
        Assert.assertTrue(bracketMatch.isBalanced(""));
    }
}
