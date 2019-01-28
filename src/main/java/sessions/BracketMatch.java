package sessions;

public class BracketMatch {

    public boolean isBalanced(String string) {
        char[] brackets = string.toCharArray();
        int count = 0;

        for (char bracket: brackets) {
            if (bracket == '(') {
                count++;
            } else {
                if (count < 1) {
                    return false;
                }
                count--;
            }
        }

        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }
}
