package daily_problems.Problem70;

public class PerfectNumber {
/*
A number is considered perfect if its digits sum up to exactly 10.

Given a positive integer n, return the n-th perfect number.

For example, given 1, you should return 19. Given 2, you should return 28.
 */
    public int createPerfectNumber(int num) {
        int total = getTotal(num, 0);
        if (total > 10) return -1;
        int numberToInclude = 10 - total;
        return num * 10 + numberToInclude;
    }

    public int getTotal(int num, int total) {
         if (num/10 == 0) return total + num;
         int lastDigit = num%10;
         return getTotal(num/10, total + lastDigit);
    }
}
