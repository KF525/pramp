package daily_problems.Misc;

import junit.framework.Assert;
import org.junit.Test;

public class LongestPalindromicNonContiguousStringTest {

    LongestPalindromicNonContiguousString longestPalindromicNonContiguousString = new LongestPalindromicNonContiguousString();

    @Test
    public void getPalindromeReturnsLongestNonContiguous() {
        String input = "abdbcbaad"; //abcba or dbcbd
        String input2 = "dagbgda";
        Assert.assertEquals("abcba", longestPalindromicNonContiguousString.getPalindrome(input));
        Assert.assertEquals("agbga", longestPalindromicNonContiguousString.getPalindrome(input2));
    }
}
