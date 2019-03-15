package daily_problems.Problem46;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromicContiguousStringTest {

    LongestPalindromicContiguousString contigPalindrome = new LongestPalindromicContiguousString();

    @Test
    public void findLongestPalindromicContiguousStringReturnsLongestPalindrome() {
        Assert.assertEquals("racecar", contigPalindrome.findLongestPalindromicContiguousString("racecar"));
    }
}
