package daily_problems.Misc;

import java.util.*;

public class LevNetworkSize {

    public int levNetworkSize(List<String> dictionary, String startingWord) {
        Queue<String> queue = new LinkedList();
        List<String> countedWords = new ArrayList();

        queue.add(startingWord);

        while (!queue.isEmpty()) {
            String currentWord = queue.remove();
            for (String word : dictionary) {
                if (isEditDistanceOneAway(word, currentWord)
                        && !countedWords.contains(word)) {
                    countedWords.add(word);
                    queue.add(word);
                }
            }
        }
        return countedWords.size();
    }

    public boolean isEditDistanceOneAway(String word1, String word2) {
        return isEditDistanceOneAwayHelper(word1, word2, 0);
    }

    public boolean isEditDistanceOneAwayHelper(String word1, String word2, int current) {
        if (word1.equals(word2) && current < 2) {
            return true;
        } else if (word1.isEmpty()) {
            return current + word2.length() < 2;
        } else if (word2.isEmpty()) {
            return current + word1.length() < 2;
        } else {
            if (word1.charAt(0) == word2.charAt(0)) {
                return isEditDistanceOneAwayHelper(
                        word1.substring(1, word1.length()),
                        word2.substring(1, word2.length()), current);
            } else {
                boolean replace = isEditDistanceOneAwayHelper(
                        word1.substring(1, word1.length()),
                        word2.substring(1, word2.length()), current + 1);
                boolean remove = isEditDistanceOneAwayHelper(
                        word1.substring(1, word1.length()),
                        word2, current + 1);

                return replace || remove;
            }
        }
    }

//    public boolean isOneEditAway(String word1, String word2) {
//        String shorterWord;
//        String longerWord;
//
//        if (word1.length() < word2.length()) {
//            shorterWord = word1;
//            longerWord = word2;
//        } else {
//            shorterWord = word2;
//            longerWord = word1;
//        }
//
//        if (Math.abs(word1.length() - word2.length()) > 1) return false;
//
//        if (shorterWord.length() == longerWord.length()) {
//            return isOneSwapAway(shorterWord, longerWord);
//        } else {
//            return isOneInsertAway(shorterWord, longerWord);
//        }
//    }
//
//    public boolean isOneInsertAway(String shorterWord, String longerWord) {
//        int counter = 0;
//        int shorterIndex = 0;
//        int longerIndex = 0;
//
//        while (longerIndex < longerWord.length()) {
//            if (shorterWord.charAt(shorterIndex) != longerWord.charAt(longerIndex)) {
//                counter = counter + 1;
//                longerIndex = longerIndex + 1;
//                if (counter > 1) return false;
//            } else {
//                shorterIndex = Math.min(shorterIndex + 1, shorterWord.length() - 1);
//                longerIndex = longerIndex + 1;
//            }
//
//        }
//        return true;
//    }
//
//    public boolean isOneSwapAway(String shorterWord, String longerWord) {
//        int counter = 0;
//        int shorterIndex = 0;
//        int longerIndex = 0;
//
//        while (longerIndex < longerWord.length()) {
//            if (shorterWord.charAt(shorterIndex) != longerWord.charAt(longerIndex)) {
//                counter = counter + 1;
//                longerIndex = longerIndex + 1;
//                shorterIndex = shorterIndex + 1;
//                if (counter > 1) return false;
//            } else {
//                shorterIndex = shorterIndex + 1;
//                longerIndex = longerIndex + 1;
//            }
//
//        }
//        return true;
//    }
}
