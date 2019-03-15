package daily_problems.Problem13;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringDistinctKChars {
/*
Given an integer k and a string s, find the length of the longest substring that contains at most k distinct characters.

For example, given s = "abcba" and k = 2, the longest substring with k distinct characters is "bcb".
 */
    public String findLongestSubString(String input, int k) {

        int i = 0;
        int nextSeenCharacter = 0;
        Set<Character> currentCharacters = new HashSet();
        String currentString = "";
        String longestString = "";

        while (i < input.length()) {
            if (currentCharacters.contains(input.charAt(i))) {
                currentString = currentString + input.charAt(i);
                i++;
            } else if (currentCharacters.size() == 1) {
                nextSeenCharacter = i;
                currentCharacters.add(input.charAt(i));
                currentString = currentString + input.charAt(i);
                i++;
            } else if (currentCharacters.size() < k) {
                currentCharacters.add(input.charAt(i));
                currentString = currentString + input.charAt(i);
                i++;
            } else {
                if (currentString.length() > longestString.length()) {
                    longestString = currentString;
                }
                currentCharacters = new HashSet<>(); //empty out the set -- find a better way to do this
                currentString = "";
                i = nextSeenCharacter;
            }
        }
        if (currentString.length() > longestString.length()) {
            return currentString;
        } else {
            return longestString;
        }
    }
}


/*
this can be made more efficient by not doing work that will just be subsets strings we've already found - think about this
 */