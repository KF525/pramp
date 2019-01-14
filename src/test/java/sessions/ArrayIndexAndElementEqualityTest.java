package sessions;

import com.sun.tools.javac.util.List;
import org.junit.Assert;
import org.junit.Test;

public class ArrayIndexAndElementEqualityTest {

    ArrayIndexAndElementEquality arrayIndexAndElementEquality = new ArrayIndexAndElementEquality();

    @Test
    public void indexEqualsValueSearchReturnsIndexThatMatchestValue() {
        List<Integer> ints = List.of(-8, 0,2,5);
        Assert.assertEquals(2, arrayIndexAndElementEquality.indexEqualsValueSearch(ints));
    }

    @Test
    public void indexEqualsValueSearchReturnsSmallestIndexThatMatchestValue() {
        List<Integer> ints = List.of(-8, 1,2,5, 8);
        Assert.assertEquals(1, arrayIndexAndElementEquality.indexEqualsValueSearch(ints));
    }

    @Test
    public void indexEqualsValueSearchReturnsNegativeOneIfNoMatch() {
        List<Integer> ints = List.of(-1, 0,3,6);
        Assert.assertEquals(-1, arrayIndexAndElementEquality.indexEqualsValueSearch(ints));
    }
}

