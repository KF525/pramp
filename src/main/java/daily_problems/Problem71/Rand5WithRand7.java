package daily_problems.Problem71;

import java.util.Random;

public class Rand5WithRand7 {
/*
Using a function rand7() that returns an integer from 1 to 7 (inclusive) with uniform probability,
implement a function rand5() that returns an integer from 1 to 5 (inclusive).
*/

    public int rand5() {
        int rand5 = rand7();
        while (rand5 > 5) {
            rand5 = rand7();
        }

        return rand5;
    }

    public int rand7() {
        Random r = new Random();
        return r.nextInt(6) + 1;
    }
}
