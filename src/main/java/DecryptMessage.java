public class DecryptMessage {

    public String decrypt(String word) {
        if (word.isEmpty()) return word; //handles empty string case
        char[] chars = word.toCharArray();

        for (int i = 1; i < chars.length; i++) {
            int previousChar = chars[i-1];
            int currentChar = chars[i];
            int charPlusPrevious = findCharValuePlusPrevious(previousChar, currentChar);
            chars[i] = (char) charPlusPrevious;
        }

        for (int i = chars.length - 1; i > 0; i--) {
            int charMinusPrevious = chars[i] - chars[i-1];
            chars[i] = (char) charMinusPrevious;
        }

        chars[0] = (char) (chars[0] - 1);

        return String.valueOf(chars);
    }

    private int findCharValuePlusPrevious(int previousChar, int currentChar) {
        //add 26 until currentChar - previousChar is in the range of ascii a-z (97-122)
        if (currentChar - previousChar <= 96) {
            return findCharValuePlusPrevious(previousChar, currentChar + 26);
        }
        return currentChar;
    }



    /*
    These are rules to encrypt. We want the reverse to decrypt. Go backwards!
    Convert every letter to its ASCII value.
    Add 1 to the first letter,
    and then for every letter from the second one to the last one,
    add the value of the previous letter.
    Subtract 26 from every letter until it is in the range of lowercase letters a-z in ASCII.
    Convert the values back to letters.
     */
}
