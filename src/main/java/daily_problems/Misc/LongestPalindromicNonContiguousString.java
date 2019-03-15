package daily_problems.Misc;

public class LongestPalindromicNonContiguousString {

    public String getPalindrome(String word) {
        if (word.length() <= 1) return word;

        String palindromeExclusive = getPalindrome(word.substring(1));

        char currentChar = word.charAt(0);
        int maybeIndex = word.lastIndexOf(word.charAt(0));
        if (maybeIndex != 0) {
            String palindromeInclusive = currentChar + getPalindrome(word.substring(1, maybeIndex)) + currentChar;
            if (palindromeInclusive.length() > palindromeExclusive.length()) return palindromeInclusive;

            if (palindromeInclusive.length() == palindromeExclusive.length()) {
                if (palindromeInclusive.compareTo(palindromeExclusive) < 0) {
                    return palindromeInclusive;
                } else {
                    return palindromeExclusive;
                }
            }
        }

        return palindromeExclusive;
    }
}

//abdbcbaad
//result1= "a" + getPalindrome("bdbcba") + "a"
//result2 = getPalindrome("bdbcbaad");