package daily_problems.Misc;

public class ReverseInt {

    public int reverseInt(int i) {
        int reverse = 0;
        int lastDigit = 0;
        while (i >= 1) {
            lastDigit = i % 10;
            reverse = reverse * 10 + lastDigit;
            i = i / 10;
        }

        return reverse;
    }
}
