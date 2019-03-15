package sessions;

import junit.framework.Assert;
import org.junit.Test;

public class RegExTest {

    RegEx regEx = new RegEx();

    @Test
    public void isMatchCorrectlyReturnsTrueIfMatch() {
        Assert.assertTrue(regEx.isMatch("acd", "ab*c."));
        Assert.assertTrue(regEx.isMatch("abc", "a.c"));
        Assert.assertTrue(regEx.isMatch("aa", "aa"));
        Assert.assertTrue(regEx.isMatch("abbb", "ab*"));
        Assert.assertTrue(regEx.isMatch("abaa", "a.*a*"));
    }
}
