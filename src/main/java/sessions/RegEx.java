package sessions;

public class RegEx {
    static boolean isMatch(String text, String pattern) {

        //base cases
        if (pattern.isEmpty()) return text.isEmpty();
        if (text.isEmpty() && (pattern.length() == 2 && pattern.charAt(1) == '*')) {
            return true;
        }

        //handles the 1 or more * case with character
        if (!text.isEmpty() && pattern.length() > 1 &&
                (text.charAt(0) == pattern.charAt(0) && pattern.charAt(1) == '*')) {
            return isMatch(text.substring(1), pattern);
        }

        //handles the 1 or more * case with .
        if (!text.isEmpty() && pattern.length() > 1 &&
                (pattern.charAt(0) == '.' && pattern.charAt(1) == '*')) {
            if (text.charAt(0) == text.charAt(1)) {
                return isMatch(text.substring(1), pattern);
            } else {
                return isMatch(text.substring(1), pattern.substring(2));
            }
        }

        //handles the exact or single match case
        if (!text.isEmpty() && (text.charAt(0) == pattern.charAt(0) || pattern.charAt(0) == '.')) {
            return isMatch(text.substring(1), pattern.substring(1));
        }

        //handles the 0 * case
        if (!text.isEmpty() && pattern.charAt(1) == '*') {
            return isMatch(text, pattern.substring(2));
        }

        return false;

    }
}

/*
Write a function to connect all the adjacent nodes at the same level in a binary tree. Structure of the given Binary Tree node is like following.

      A
     / \
    B   C
   /
   D
  [A]->NULL
  [C]->[B]->NULL
  [D]->NULL


  Queue
  1) enqueue the root
  2) while !queue.isEmpty() - pop off item add to linkedlist and enqueue its children
  3) if queue is empty -> return the list of Nodes

  helper(ArrayList<LLNode> list, root, 1)

 */