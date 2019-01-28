package daily_problems;

public class LongestPalindromicContiguousString {
    /*
    Given a string, find the longest palindromic contiguous substring. If there are more than one with the maximum length, return any one.

    For example, the longest palindromic substring of "aabcdcb" is "bcdcb". The longest palindromic substring of "bananas" is "anana".
    */

    //bananas => anana

    public String findLongestPalindromicContiguousString(String word) {
       return helper(word,  "");
    }

    public String helper(String word, String palindrome) {
        if (word.isEmpty()) return palindrome;

        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            helper(word.substring(1, word.length() - 1), palindrome);
        } else {
            String palindrome1 = helper(word.substring(0, word.length() - 1), palindrome);
            String palindrome2 = helper(word.substring(1, word.length()), palindrome);
        }

        return palindrome;
    }

}
