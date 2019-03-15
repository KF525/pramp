package daily_problems.Misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidSentence {
    List<String> dict = Arrays.asList("quick", "brown", "the", "fox");

    List<String> returnValidSentence(List<String> dict, String sentence) {
        List<String> words = generateWord(dict, sentence, 0,0, new ArrayList<>());
        return words;
    }

    List<String> generateWord(List<String> dict, String sentence, int start, int end, List<String> words) {
        if (end > sentence.length() - 1 && start == end) return words;

        String possibleWord = sentence.substring(start, end);

        if (dict.contains(possibleWord)) {
            words.add(possibleWord);
            return generateWord(dict, sentence, end, end, words);
        } else if (end > sentence.length() - 1 && start != end) { //possible word is not in dictionary and we are at the end of sentence
            return null;
        } else {
            return generateWord(dict, sentence, start, end + 1, words);
        }
    }

    //create words -- as soon as we have one, go through the list and start working on the next work
    //but also continue to work on existing in case multiple words that start with same letters
}



