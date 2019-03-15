package daily_problems.Problem34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CreatePalindromeWithInserts {
/*
Given a string, find the palindrome that can be made by inserting the fewest number of characters as possible anywhere in the word.
If there is more than one palindrome of minimum length that can be made, return the lexicographically earliest one (the first one alphabetically).

For example, given the string "race", you should return "ecarace", since we can add three letters to it (which is the smallest amount to make a palindrome).
There are seven other palindromes that can be made from "race" by adding three letters, but "ecarace" comes first alphabetically.

As another example, given the string "google", you should return "elgoogle".

race => ecarace, racecar,
ERACARE, RACE     XRXAXCXEX
how close is it to being a palindrome
when grabbing all the longest non-contiguous if multiple go through each and choose alphabetical
*/

    // Finds a list of all the longest noncontiguous palindromes in the word
    // "race" => List("r", "a", "c", "e")
    // "google" => List("goog") // "goloeg" => List("goog") "google" - "goog" => "l" "e"

    /*

    "r" -> ecarace
    "a" -> letters before a: r, letters after a: ce | ecrarce
    "c" -> raecear, eracare, reacaer
    "e" -> racecar


    look at the letters that go on the left
    look at the reverse of the letters that go on the right
    merge them together in the best lexicographical way

    left side: fi
    reverse right side: re



    "f"
    "i"
    "v" -> [fi]v[er] -> fireverif, frieveirf, left side: [fi], [re] {fire, refi, frie, frei, rfie}
    "e"
    "r"

    "gtoogle"

    "elgtootgle" ->


     */


    //"race" => List("r", "a", "c", "e")
    public List<String> longestNonContiguousPalindrome(String word) {
        if (word.length() <= 1) {
            return new ArrayList<>(Arrays.asList(word));
        }

        if (word.charAt(0) == word.charAt(word.length() - 1)) {
           return longestNonContiguousPalindrome(word.substring(1, word.length() - 1))
                   .stream()
                   .map(s -> word.charAt(0) + s + word.charAt(0))
                   .collect(Collectors.toList());
        }

        List<String> palindromes2 = longestNonContiguousPalindrome(word.substring(0, word.length()-1));
        List<String> palindromes3 = longestNonContiguousPalindrome(word.substring(1));

        if (palindromes2.get(0).length() < palindromes3.get(0).length()) {
            return palindromes3;
        } else if (palindromes3.get(0).length() < palindromes2.get(0).length()) {
            return palindromes2;
        } else {
            palindromes2.addAll(palindromes3);
            return palindromes2;
        }
    }

    //List("r","a","c","e) => List("ecarace", "ecrarce", "eracare"...)
    public List<String> findCompletePalindromes(List<String> longestNonContiguousPalindromes) {
        return null;
    }
}
