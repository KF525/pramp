package daily_problems;

import java.util.List;

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
