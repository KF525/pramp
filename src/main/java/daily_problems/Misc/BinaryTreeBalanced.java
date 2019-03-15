package daily_problems.Misc;

public class BinaryTreeBalanced {

    public boolean isBalanced(Node root) {
        int leftHeight; //get height of left subtree
        int rightHeight; //get height of right subtree

        if (root == null) return true; //if it's a leaf node return true

        //not at null so let's get height of trees
        leftHeight = getHeight(root.left); //get height of left
        rightHeight = getHeight(root.right); //get height of right

        int difference = Math.abs(leftHeight - rightHeight); //get difference between the two

        if (difference <= 1
                && isBalanced(root.left)
                && isBalanced(root.right)) { //if the difference is less than or equal to one and the left subtree and right subtrees are also balanced
            return true;
        }

        return false; //otherwise it is not balanced
    }

    private int getHeight(Node root) {
        if (root == null) return 0; //if the root is null it is 0 height
        return 1 + Math.max(getHeight(root.left), getHeight(root.right)); //otherwise not at null add 1 (for height of current node) and the Max of the left subtree height and right subtree height
    }

    static class Node<T> {
        T value;
        Node left, right;

        public Node(T value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
}
