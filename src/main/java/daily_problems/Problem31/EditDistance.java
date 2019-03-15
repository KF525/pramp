package daily_problems.Problem31;

public class EditDistance {
/*
The edit distance between two strings refers to the minimum number of character insertions, deletions, and substitutions required to change one string to the other. For example, the edit distance between “kitten” and “sitting” is three: substitute the “k” for “s”, substitute the “e” for “i”, and append a “g”.

Given two strings, compute the edit distance between them.
 */

    public int countEditDistance(int count, String w1, String w2) {
        if (w1.equals(w2)) return count;
        if (w1.isEmpty()) {
            return count + w2.length();
        } else if (w2.isEmpty()) {
            return count + w1.length();
        } else if (w1.charAt(0) == w2.charAt(0))
            return countEditDistance(count, w1.substring(1, w1.length()), w2.substring(1, w2.length()));
        else {
            int replace = countEditDistance(count + 1, w1.substring(1, w1.length()), w2.substring(1, w2.length()));
            int remove = countEditDistance(count + 1, w1, w2.substring(1, w2.length()));
            return Math.min(replace, remove);
        }
    }
}
