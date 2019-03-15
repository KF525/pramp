package daily_problems.Problem50;

public class BinaryTreeArithmetic {
    /*
    Suppose an arithmetic expression is given as a binary tree. Each leaf is an integer and each internal node is one of '+', '−', '∗', or '/'.

    Given the root to such a tree, write a function to evaluate it.

    First thought - traverse through the tree, put the values in a stack and then evaluate
    */

    public int evaluate(Node root) {
        if (root.left == null && root.right == null) {
            return Integer.parseInt(root.data);    //if node is leaf then it's an integer
        } else {
            if (root.data.equals("+")) {
                return evaluate(root.left) + evaluate(root.right);
            } else if (root.data.equals("-")) {
                return evaluate(root.left) - evaluate(root.right);
            } else if (root.data.equals("/")){
                return evaluate(root.left) / evaluate(root.right);
            } else {
                return evaluate(root.left) * evaluate(root.right);
            }
        }
    }

    //switch
    //switch (root.data) {
    // case "+":
        //return ....
    //default: (else)
        //then throw?? or the remaining operator


    static class Node {
        String data;
        Node left,right;

        public Node(String data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


}