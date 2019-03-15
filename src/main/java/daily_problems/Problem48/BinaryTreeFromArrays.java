package daily_problems.Problem48;

public class BinaryTreeFromArrays {
/*
Given pre-order and in-order traversals of a binary tree, write a function to reconstruct the tree.

For example, given the following preorder traversal:

[a, b, d, e, c, f, g]

And the following inorder traversal:

[d, b, e, a, f, c, g]

You should return the following tree:

    a
   / \
  b   c
 / \ / \
d  e f  g
 */
    public Node constructTree(char[] preOrder, char[] inOrder) {
        return constructTreeHelper(preOrder, 0, preOrder.length - 1, inOrder, 0, inOrder.length - 1);
   }

    private Node constructTreeHelper(char[] preOrder, int preStart, int preEnd,
                                     char[] inOrder, int inStart, int inEnd) {
        if (preStart >= preEnd || inStart >= inEnd) {
            return null;
        } else {
            char rootData = preOrder[preStart];
            int inOrderRootIndex = findRootLocation(inOrder, rootData);

            int lengthOfLeft = inOrderRootIndex - inStart;
            Node left = constructTreeHelper(
                    preOrder, preStart + 1, preStart + lengthOfLeft,
                    inOrder, inStart, inOrderRootIndex - 1);

            Node right =  constructTreeHelper(
                    preOrder, preStart + 1 + lengthOfLeft, preEnd,
                    inOrder, inOrderRootIndex + 1, inEnd);

            return new Node(
                    rootData,
                    left, right
            );
        }
    }

    public int findRootLocation(char[] preOrder, char root) {
        for (int i = 0; i < preOrder.length; i++) {
            if (preOrder[i] == root) {
                return i;
            }
        }
        return -1;
    }

    public class Node {
        char data;
        Node left, right;

        public Node(char data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}

/*
inOrder [A, B, D, E, C, F, G]
preorder [D, B, E, A, F, C, G]
 */