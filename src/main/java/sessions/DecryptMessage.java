package sessions;

public class DecryptMessage {
    public String decrypt(String word) {

        //ENCRYPTION
        //add 1 to the first letter
        //every letter from the second one to the last one, add value of previous letter
        //subtract 26 from every letter until it is in the range of lowercase letters a-z ASCII
        //convert values back to letters
        //DECRYPTION will reverse all these steps

        if (word.isEmpty()) return word; //handles empty case

        char[] letters = word.toCharArray(); //turn word into list of characters

        //subtract previous value from current
        for (int i=1; i < letters.length; i++) {
            int previousChar = letters[i-1];
            int currentChar = letters[i];
            int charPlusPrevious = findCharValuePlusPrevious(previousChar, currentChar);
            letters[i] = (char) charPlusPrevious;
        }

        //subtract the previous value from current value, starting from the back
        for (int i=letters.length-1; i > 0; i--) {
            int previousChar = letters[i-1];
            int currentChar = letters[i];
            letters[i] = (char) (currentChar - previousChar);
        }

        //subtract 1 from the first value
        letters[0] = (char) (letters[0] - 1);

        return String.valueOf(letters);
    }

    public int findCharValuePlusPrevious(int previousChar, int currentChar) {
        if (currentChar - previousChar <= 96) {
            return findCharValuePlusPrevious(previousChar, currentChar + 26);
        }
        return currentChar;
    }

    /*

    The most useful way to tackle these kind of problems is using reverse engineering.
    And for that your peer needs many examples - more than provided.

    The simplest solution to this question is to decrypt one letter at a time, each time using the letters already decrypted.
    If your peer is stuck, advise them to try finding the relations between the previous decrypted letter and the current encrypted one.

    First letter is easy to decrypt:
    1) Convert letter back to its ASCII value
    2) Subtract 1 from it
    3) Move value to be in range of a-z (97-122) by adding 26
    4) Convert the result backt to a character

    Rest of letters:
    1) Convert the current letter back to its ASCII value
    2) Subtract secondStepPrev from it
    3) Move the value to be in the range of a-z (97-122) by adding 26
    4) Convert the result back to a chracter. Store its value in prev.
    Add its value to secondStepPrev (for decryption of next letter).

    dec[n] = the nth letter before encryption
    enc[n] = the nth letter after encryption
    secondStep[n] = the nth letter immediately after step 2 in encryption
    enc[n] = dec[n] + secondStep[n-1] + 26(m) -> isolate dec[n]
    dec[n] = enc[n] - secondStep[n-1] - 26(m)

    the decrypted letter is easily found adding 26s to enc[n] - secondStep[n] until it is in the right range

     */

    public String decryptMessage2(String word) {
        int secondStep = 1;
        String decryption = "";

        for (int i=0; i < word.length(); i++) {
            int asciiValue = (int) (word.charAt(i));
            asciiValue = asciiValue - secondStep;

            while (asciiValue < 97) {
                asciiValue += 26;
            }

            decryption = decryption + (char) asciiValue;
            secondStep += asciiValue;
        }

        return decryption;
    }
}
