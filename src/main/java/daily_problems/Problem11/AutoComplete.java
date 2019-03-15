package daily_problems.Problem11;

import java.util.List;

/*
Implement an autocomplete system. That is, given a query string s and a set of all possible query strings,
return all strings in the set that have s as a prefix.

For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].
 */

public class AutoComplete {
    public List<String> returnPossibleWords(String prefix, List<String> words) {
        for (int i=0; i < prefix.length(); i++) {
            char currentChar = prefix.charAt(i);

            for (int w=0; w < words.size(); w++) {
                if (!(words.get(w).charAt(i) == currentChar)) {
                    words.remove(w);
                }
            }
        }
        return words;
    }
    //space O(1), time O(m + n) ??

    //better approaches?

    //use a trie
}
