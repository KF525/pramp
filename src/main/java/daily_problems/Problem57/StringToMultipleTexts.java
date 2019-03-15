package daily_problems.Problem57;

import java.util.ArrayList;
import java.util.List;

public class StringToMultipleTexts {

    /*
    Given a string s and an integer k, break up the string into multiple texts such that each text has a length of k or less. You must break it up so that words don't break across lines. If there's no way to break the text up, then return null.

You can assume that there are no spaces at the ends of the string and that there is exactly one space between each word.

For example, given the string "the quick brown fox jumps over the lazy dog" and k = 10, you should return: ["the quick", "brown fox", "jumps over", "the lazy", "dog"]. No string in the list has a length of more than 10.
     */
    public List<String> generateStrings(String str, int k) {

        List<String> result = new ArrayList<>();
        int currentIndex = 0;
        int limitIndex = k-1;

        if (str.isEmpty()) return null;

        while (true) {
            if (limitIndex == currentIndex) return null;

            if (limitIndex == str.length() -1 && limitIndex - currentIndex <= k) {
                result.add(str.substring(currentIndex, limitIndex + 1));
                break;
            } else if (limitIndex == str.length() -1) {
                return null;
            } else if (str.charAt(limitIndex) == ' ' || str.charAt(limitIndex + 1) == ' ') {
                result.add(str.substring(currentIndex, limitIndex + 1));
                currentIndex = limitIndex + 1;
                if (currentIndex + k - 1 < str.length()) {
                    limitIndex = currentIndex + k - 1 ;
                } else {
                    limitIndex = str.length() - 1;
                }
            } else {
                limitIndex = limitIndex - 1;
            }
        }

        return result;
    }
}
