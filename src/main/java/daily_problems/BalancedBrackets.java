package daily_problems;

import java.util.*;

public class BalancedBrackets {
    public boolean isBalanced(String brackets) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        for (int i=0; i < brackets.length(); i++) {
            Character currentBracket = brackets.charAt(i);
            if (map.keySet().contains(currentBracket)) {
                stack.push(currentBracket);
            } else {
                Character stackBracket = stack.pop();
                if (!map.containsKey(stackBracket) || //if it is an open bracket
                        !(map.get(stackBracket) == currentBracket)) { //if the currentBracket is the closed version
                    return false;
                }
            }
        }

        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}

//if it is an open just push it onto the stack
//if it is a closed pop off the stack and see if it is the open counterpart to the closed
//if we get through the string and stack is empty, then it is balanced
