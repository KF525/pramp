package sessions;

import org.junit.Test;

public class ArrayArrayProductsTest {

    ArrayArrayProducts arrayArrayProducts = new ArrayArrayProducts();

    @Test
    public void arrayOfArrayProductsReturnsArrayOfProducts() {
        int[] array = new int[]{2,7,3,4};

        arrayArrayProducts.arrayOfArrayProducts(array);
    }
}
