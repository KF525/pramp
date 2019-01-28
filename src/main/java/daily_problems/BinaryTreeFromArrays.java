package daily_problems;

public class BinaryTreeFromArrays {

    public Node constructTree(char[] preOrder, char[] inOrder) {
        return constructTreeHelper(preOrder, 0, preOrder.length, inOrder, 0, inOrder.length);
   }

    private Node constructTreeHelper(char[] preOrder, int preStart, int preEnd,
                                     char[] inOrder, int inStart, int inEnd) {
        if (preStart >= preEnd || inStart >= inEnd) {
            return null;
        } else {
            char rootData = preOrder[preStart];
            int preOrderRootIndex = findRootLocation(inOrder, rootData);

            Node left = constructTreeHelper(
                    preOrder, preStart + 1, preOrderRootIndex,
                    inOrder, 0, preOrderRootIndex -1);

            Node right =  constructTreeHelper(
                    preOrder, preOrderRootIndex + 1, preOrder.length - 1,
                    inOrder, preOrderRootIndex +1, inOrder.length -1);

            return new Node(
                    rootData,
                    left, right
            );
        }
    }

    public int findRootLocation(char[] preOrder, int root) {
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