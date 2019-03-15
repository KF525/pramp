package daily_problems.Misc;

import daily_problems.Misc.BinaryTreeBalanced;
import junit.framework.Assert;
import org.junit.Test;

public class BinaryTreeBalancedTest {

    BinaryTreeBalanced binaryTreeBalanced = new BinaryTreeBalanced();

    @Test
    public void isBalancedReturnsTrueIfBalancedTree() {
        BinaryTreeBalanced.Node root = new BinaryTreeBalanced.Node<>(2);
        BinaryTreeBalanced.Node left = new BinaryTreeBalanced.Node<>(4);
        BinaryTreeBalanced.Node right = new BinaryTreeBalanced.Node<>(3);
        root.left = left;
        root.right = right;

        Assert.assertTrue(binaryTreeBalanced.isBalanced(root));

        root.left = new BinaryTreeBalanced.Node<>(1);

        Assert.assertTrue(binaryTreeBalanced.isBalanced(root));
    }

    @Test
    public void isBalancedReturnsFalseIfNotBalancedTree() {
        BinaryTreeBalanced.Node root = new BinaryTreeBalanced.Node<>(2);
        BinaryTreeBalanced.Node left = new BinaryTreeBalanced.Node<>(4);
        BinaryTreeBalanced.Node right = new BinaryTreeBalanced.Node<>(3);
        BinaryTreeBalanced.Node leftLeft = new BinaryTreeBalanced.Node(1);
        BinaryTreeBalanced.Node leftLeftLeft = new BinaryTreeBalanced.Node(6);
        left.left = leftLeft;
        leftLeft.left = leftLeftLeft;
        root.left = left;
        root.right = right;

        Assert.assertFalse(binaryTreeBalanced.isBalanced(root));

    }
}
