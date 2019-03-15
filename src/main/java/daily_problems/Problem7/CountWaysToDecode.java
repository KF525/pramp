package daily_problems.Problem7;

public class CountWaysToDecode {

    /*
    Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.

For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.

You can assume that the messages are decodable. For example, '001' is not allowed.
     */

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