package daily_problems;

public class StringCompression {
    public String encodeString(String s) {
        char currentChar = s.charAt(0);
        int currentCharCount = 1;
        String compressedString = "";

        for (int i=1; i < s.length(); i++) {
            if (s.charAt(i) == currentChar) {
                currentCharCount++;
            } else {
                compressedString = addToCompressedString(compressedString, currentCharCount, currentChar);
                currentChar = s.charAt(i);
                currentCharCount = 1;
            }
        }

        compressedString = addToCompressedString(compressedString, currentCharCount, currentChar);
        return compressedString;
    }

    public String addToCompressedString(String compressedString,
                                        int currentCharCount, char currentChar) {
        String count = String.valueOf(currentCharCount);
        String character = String.valueOf(currentChar);
        return compressedString + count + character;
    }

    public String decodeString(String s) {
        String decompressedString = "";
        int i = 0;

        while (i < s.length()) {
            int count = Integer.parseInt(String.valueOf(s.charAt(i)));
            char character = s.charAt(i+1);
            decompressedString = addToDecodedString(decompressedString, count, character);
            i = i+2;
        }
        return decompressedString;
    }

    public String addToDecodedString(String decompressedString, int count, char character) {
        if (count == 0) {
            return decompressedString;
        } else {
            decompressedString = decompressedString + String.valueOf(character);
            return addToDecodedString(decompressedString, count - 1, character);
        }
    }
}

//we know that we need to decode in pairs
//the first one can be parsed as an int
//and that int speaks to how many times the character shows up in the string
//the second char is the character