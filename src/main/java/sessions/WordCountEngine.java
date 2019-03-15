package sessions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WordCountEngine {
    static int largestCount2 = 0;

    public static String[][] wordCountEngine2(String text) {
        String[] parsedText = parseText2(text); //parse string: case insensitive, no punctuation, no white space
        Map<String, Integer> frequencyMap = getFrequency2(parsedText); //get ordered frequency
        List<List<String>> orderedWords = orderWords2(frequencyMap);
        return buildReturn2(orderedWords, frequencyMap.size()); //return ordered array
    }

    public static String[] parseText2(String text) {
        return text.toLowerCase().replaceAll("[^a-z\\s]", "").split("\\s+");
    }

    public static Map<String, Integer> getFrequency2(String[] parsedText) {
        Map<String, Integer> frequencyMap = new LinkedHashMap<>();

        for (String word: parsedText) {
            if (!frequencyMap.containsKey(word)) {
                frequencyMap.put(word, 0);
            }

            Integer count = frequencyMap.get(word);
            frequencyMap.put(word, count+1);
            if (count + 1 > largestCount2) {
                largestCount2 = count+1;
            }
        }

        return frequencyMap;
    }

    public static List<List<String>> orderWords2(Map<String, Integer> frequencyMap) {
        List<List<String>> orderedWords = new ArrayList<>(largestCount2 + 1);

        for (int i = 0; i < largestCount2 + 1; i++) {
            orderedWords.add(null);
        }

        for (String word: frequencyMap.keySet()) {
            Integer count = frequencyMap.get(word);
            if (orderedWords == null) {
                orderedWords.set(count, new ArrayList<>());
            }
            orderedWords.get(count).add(word);
        }

        return orderedWords;
    }

    public static String[][] buildReturn2(List<List<String>> orderedWords, int uniqueWords) {
        String[][] resultArray = new String[uniqueWords][2];
        int currentIndex = 0;

        for (int i = orderedWords.size() - 1; i > 0; i--) {
            List<String> words= orderedWords.get(i);
            if (words == null) continue;
            for (String word: words) {
                resultArray[currentIndex][0] = word;
                resultArray[currentIndex][1] = String.valueOf(i);
                currentIndex++;
            }
        }
        return resultArray;
    }

    static int largestCount = -1;

    public static String[][] wordCountEngine(String text) {
        String[] words = generateWordList(text); //clean up words and return an array of each
        Map<String, Integer> frequencyMap = getFrequency(words); //get frequency of the words
        return sortWords(frequencyMap);
    }


    private static String[][] sortWords(Map<String, Integer> map) {
        //init a word counter list of lists.
        List<List<String>> wordCounter = new ArrayList<>(largestCount + 1);
        for (int i=0; i < largestCount + 1; i++) {
            wordCounter.add(null); //set each index to null
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
        String[][] result = new String[uniqueWords][2]; //size of array will be unique words, and each entry will contain word and count
        int currentIndex = 0;

        for (int i=bucket.size()-1; i > 0; i--) { //because we want to go from the largest count to smallest
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
