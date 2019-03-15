package daily_problems.Problem46;

public class LongestPalindromicContiguousString {
    /*
    Given a string, find the longest palindromic contiguous substring. If there are more than one with the maximum length, return any one.

    For example, the longest palindromic substring of "aabcdcb" is "bcdcb". The longest palindromic substring of "bananas" is "anana".
    */

    //bananas => anana
    //abba

    public String findLongestPalindromicContiguousString(String word) {
       return helper(word);
    }

    public String helper(String word) {
        if (word.length() <= 1) return word;

        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            String middle = word.substring(1, word.length() - 1);
            String palindrome = helper(middle);
            if (palindrome.equals(middle)) {
                return word;
            }
        }

        String palindrome2 = helper(word.substring(0, word.length() - 1));
        String palindrome3 = helper(word.substring(1, word.length()));

        if (palindrome2.length() > palindrome3.length()) {
            return palindrome2;
        } else {
            return palindrome3;
        }
    }
}
