package daily_problems;

public class CountWaysToDecode {

    public int countDecodes(String input) {
      return countDecodesHelper(input, 0, 1);
    }

    public int countDecodesHelper(String input, int start, int end) {
        if (Integer.parseInt(input.substring(start, end)) > 26) {
            return 0;
        } else if (end == input.length()) {
            return 1;
        } else {
            return countDecodesHelper(input, start, end + 1) +
                    countDecodesHelper(input, end, end + 1);
        }
    }
}