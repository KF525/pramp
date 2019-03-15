package daily_problems.Problem2;

import java.util.List;
import java.util.stream.Collectors;

public class ProductMinusI {
    /*
    Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

    For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

    Follow-up: what if you can't use division?
     */

    public List<Integer> returnProducts(List<Integer> integers) {
        Integer product = integers.stream().reduce((1), (i, p) -> i*p);
        List<Integer> result = integers.stream().map(i -> product/i).collect(Collectors.toList());
        return result;
    }
}
