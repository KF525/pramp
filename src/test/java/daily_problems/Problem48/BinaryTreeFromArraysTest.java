package daily_problems.Problem48;

import daily_problems.Problem48.BinaryTreeFromArrays;
import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeFromArraysTest {

    BinaryTreeFromArrays binaryTreeFromArrays = new BinaryTreeFromArrays();

    @Test
    public void constructTreeCreatesTreeFromTwoArrays() {
        char[] inOrder = new char[]{'D', 'B', 'E', 'A', 'F', 'C', 'G'};
        char[] preOrder = new char[]{'A', 'B', 'D', 'E', 'C', 'F', 'G'};

        BinaryTreeFromArrays.Node result  =
                binaryTreeFromArrays.constructTree(preOrder, inOrder);
        Assert.assertEquals('A', result.data);
    }

    @Test
    public void constructTreeCreatesSmallTree() {
        char[] inOrder = new char[]{'B', 'A'};
        char[] preOrder = new char[]{'A', 'B'};

        BinaryTreeFromArrays.Node result  =
                binaryTreeFromArrays.constructTree(preOrder, inOrder);
        Assert.assertEquals('A', result.data);
    }
}

/*
InOrder {B, A}
PreOrder {A, B}

preStart = 0
preEnd = 1
inStart = 0
inEnd = 1

preOrder[0] = "A"
inOrderRootIndex = 1

lengthOfLeft = 1
left(preOrder, 1, 1, inOrder, 0, 0);
right(preOrder, 2, 1, inOrder, 2, 1)
 */