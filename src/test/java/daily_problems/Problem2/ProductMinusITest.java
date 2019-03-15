package daily_problems.Problem2;

import com.sun.tools.javac.util.List;
import daily_problems.Problem2.ProductMinusI;
import org.junit.Assert;
import org.junit.Test;

public class ProductMinusITest {

    ProductMinusI productMinusI = new ProductMinusI();

    @Test
    public void returnProductsReturnsNewListWithUpdatedValues() {
        List<Integer> integers = List.of(1,2,3);
        List<Integer> expectedIntegers = List.of(6,3,2);

        Assert.assertEquals(expectedIntegers, productMinusI.returnProducts(integers));
    }
}
