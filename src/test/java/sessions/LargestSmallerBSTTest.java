package sessions;

import junit.framework.Assert;
import org.junit.Test;

public class LargestSmallerBSTTest {

    LargestSmallerBST bst = new LargestSmallerBST();

    @Test
    public void findLargestSmallerKeyReturnsCorrectNodeKey() {
        bst.insert(20);
        bst.insert(9);
        bst.insert(25);
        bst.insert(5);
        bst.insert(12);
        bst.insert(11);
        bst.insert(14);

        Assert.assertEquals(25, bst.findLargestSmallerKey(26));
        Assert.assertEquals(-1, bst.findLargestSmallerKey(2));
        Assert.assertEquals(9, bst.findLargestSmallerKey(10));
        Assert.assertEquals(14, bst.findLargestSmallerKey(17));
    }
}
