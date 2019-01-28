package daily_problems;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringDistinctKChars {

    public String findLongestSubString(String input, int k) {
        //track how many distinct characters we've currently seen
        //track a current String
        //track a longest String that will be reassigned when needed
        Set<Character> currentCharacters = new HashSet();

//        if (currentCharacters.size() > k) {
//           currentCharacters = new HashSet<>();
//        } else {
//
//        }
        return "";
    }
}


/*
if k is 2:
abcba => bcb
abaccbba => cbb
aabbccc => bbccc
 */