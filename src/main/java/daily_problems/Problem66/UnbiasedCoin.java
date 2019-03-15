package daily_problems.Problem66;

import daily_problems.Problem71.Rand5WithRand7;

import java.util.Random;

public class UnbiasedCoin {

    /*
    Assume you have access to a function toss_biased() which returns 0 or 1 with a probability that's not 50-50
    (but also not 0-100 or 100-0). You do not know the bias of the coin.
     */

    public int tossUnbiased() {
        int val1 = tossBiased();
        int val2 = tossBiased();
        if (val1 == 0 && val2 == 1) {
            return 0;
        }
        if (val1 == 1 && val2 == 0) {
            return 1;
        }
        return tossBiased();
    }

    private int tossBiased() {
        Random r = new Random();
        int i = r.nextInt(10);
        if (i <= 6) {
            return 1;
        } else {
            return 0;
        }
    }
}
