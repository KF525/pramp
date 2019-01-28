package daily_problems;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeArithmeticTest {

    BinaryTreeArithmetic binaryTreeArithmetic = new BinaryTreeArithmetic();

    @Test
    public void evaluateReturnsCorrectValue() {

        BinaryTreeArithmetic.Node left =
                new BinaryTreeArithmetic.Node("3");
        BinaryTreeArithmetic.Node right =
                new BinaryTreeArithmetic.Node("2");
        BinaryTreeArithmetic.Node root =
                new BinaryTreeArithmetic.Node("*");
        root.left = left;
        root.right = right;

        Assert.assertEquals(6, binaryTreeArithmetic.evaluate(root));
    }

}

