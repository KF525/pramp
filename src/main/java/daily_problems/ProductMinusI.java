package daily_problems;

import java.util.List;
import java.util.stream.Collectors;

public class ProductMinusI {
    public List<Integer> returnProducts(List<Integer> integers) {
        Integer product = integers.stream().reduce((1), (i, p) -> i*p);
        List<Integer> result = integers.stream().map(i -> product/i).collect(Collectors.toList());
        return result;
    }

    //Todo: Without division
//    public List<Integer> returnProductsWithoutDivision(List<Integer> integers) {
//        Integer product = integers.stream().reduce((1), (i,p) -> i*p);
//
//    }
}
