package daily_problems;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeFromArraysTest {

    BinaryTreeFromArrays binaryTreeFromArrays = new BinaryTreeFromArrays();

    @Test
    public void constructTreeCreatesTreeFromTwoArrays() {
        char[] inOrder = new char[]{'D', 'B', 'E', 'A', 'F', 'C', 'G'};
        char[] preOrder = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G'};

        BinaryTreeFromArrays.Node result  =
                binaryTreeFromArrays.constructTree(preOrder, inOrder);
        Assert.assertEquals('A', result.data);
    }
}
