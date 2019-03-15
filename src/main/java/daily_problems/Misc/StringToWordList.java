package daily_problems.Misc;

import java.util.List;
import java.util.Set;

public class StringToWordList {
    Set<String> dictionary;

    public List<String> getWords(String input) {
        return null;
    }

    public StringToWordList(Set<String> words) {
        this.dictionary = words;
    }
}


//have two pointers that check if substring is contained within set
//if it is then move the pointers to immediately after last index of substring
//but we also want to keep going in case a larger substring is also a word
//and how do we know it's safe to move on when the string is not contained in substring:
    // th => not in
    // the => is in
    // theyg => not in, safe to move on most likely
//if we know the size of the max word in the dictionary then we can safely move on if substring is longer than that O(n)
//going through the string would then be O(n) * O(m) (rather than O(n) * O(n)

