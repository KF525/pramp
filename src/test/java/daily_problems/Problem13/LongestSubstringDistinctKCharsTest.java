package daily_problems.Problem13;

import daily_problems.Problem13.LongestSubstringDistinctKChars;
import junit.framework.Assert;
import org.junit.Test;

public class LongestSubstringDistinctKCharsTest {

    LongestSubstringDistinctKChars longestSubstringDistinctKChars = new LongestSubstringDistinctKChars();

    @Test
    public void findLongestSubStringReturnsLongestSubstring() {
        Assert.assertEquals("bcb", longestSubstringDistinctKChars.findLongestSubString("abcba",2));
        Assert.assertEquals("ccbb", longestSubstringDistinctKChars.findLongestSubString("abaccbba",2));
        Assert.assertEquals("ccbb", longestSubstringDistinctKChars.findLongestSubString("abaccbba",2));

        Assert.assertEquals("bbaddddddd", longestSubstringDistinctKChars.findLongestSubString("abaccbbaddddddd",3));
        Assert.assertEquals("abcde", longestSubstringDistinctKChars.findLongestSubString("abcdefghi",5));
        Assert.assertEquals("aabbccddee", longestSubstringDistinctKChars.findLongestSubString("aabbccddee",6));
    }
}
