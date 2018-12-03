import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WordCountEngine {
    static int largestCount = -1;

    public static String[][] wordCountEngine(String text) {
        String[] words = generateWordList(text);
        Map<String, Integer> frequencyMap = getFrequency(words);
        return sortWords(frequencyMap);
    }


    private static String[][] sortWords(Map<String, Integer> map) {
        //init a word counter list of lists.
        List<List<String>> wordCounter = new ArrayList<>(largestCount + 1);
        for (int i=0; i < largestCount + 1; i++) {
            wordCounter.add(null);
        }

        //add all words to list indexed by corresponding occurrence number
        for (String word: map.keySet()) {
            int frequency = map.get(word);

            List<String> wordCounterList = wordCounter.get(frequency);

            if (wordCounterList == null) {
                wordCounter.set(frequency, new ArrayList<String>());
            }

            wordCounter.get(frequency).add(word);
        }

        return buildResult(wordCounter, map.size());
    }

    private static String[][] buildResult(List<List<String>> bucket, int uniqueWords) {
        //iterate through the list in reverse order and add only non-null values to result
        String[][] result = new String[uniqueWords][2];
        int currentIndex = 0;

        for (int i=bucket.size()-1; i > 0; i--) {
            List<String> words = bucket.get(i);
            if (words == null) continue;
            for (String word: words) {
                result[currentIndex][0] = word;
                result[currentIndex][1] = String.valueOf(i);
                currentIndex++;
            }
        }

        return result;
    }

    private static Map<String, Integer> getFrequency(String[] words) {
        Map<String, Integer> frequencyMap = new LinkedHashMap<>(); //order sensitive

        for (String word: words) {
            int newCount = frequencyMap.getOrDefault(word, 0) + 1;
            frequencyMap.put(word, newCount);
            if (newCount > largestCount) {
                largestCount = newCount;
            }
        }

        return frequencyMap;
    }

    private static String[] generateWordList(String text) {
        return text.toLowerCase().replaceAll("[^a-z\\s]", "").split("\\s+");
    }
}
