package daily_problems.Problem81;

/*
Given a mapping of digits to letters (as in a phone number), and a digit string, return all possible letters the number could represent. You can assume each valid number in the mapping is a single digit.

For example if {“2”: [“a”, “b”, “c”], 3: [“d”, “e”, “f”], …} then “23” should return [“ad”, “ae”, “af”, “bd”, “be”, “bf”, “cd”, “ce”, “cf"].
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class PossibleMappings {

    public List<String> findMappings(Map<Integer, List<String>> mapping, String input) {
        List<String> possibleStrings = new ArrayList<>();
        if (input.isEmpty()) return possibleStrings;
        List<String> mappings = helper(mapping, input, possibleStrings);
        mappings.sort(Comparator.naturalOrder());
        return mappings;
    }

    public List<String> helper(Map<Integer, List<String>> mapping, String input, List<String> possible) {
        if (input.isEmpty()) return possible;

        int digit = Integer.parseInt(String.valueOf(input.charAt(0)));
        List<String> possibleChars = mapping.get(digit); //assuming it is in the mapping
        List<String> newPossible = new ArrayList<>();

        if (possible.isEmpty()) {
            for (String possibleChar : possibleChars) {
                newPossible.add(possibleChar);
            }
        } else {
            for (String possibleChar : possibleChars) {
                for (String s : possible) {
                    newPossible.add(s + possibleChar);
                }
            }
        }

        return helper(mapping, input.substring(1),  newPossible);
    }
}
