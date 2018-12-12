public class Unival {

    public int countUnival(Node root) {
        Result result = countUnivalHelper(root);
        return result.count;
    }

    public Result countUnivalHelper(Node root) {
        //if root is null, don't count
        if (root == null) {
            return new Result(true, 0);
        } else if (root.left == null && root.right == null) {
            return new Result(true, 1);
        } else {
            Result leftResult = countUnivalHelper(root.left);
            Result rightResult = countUnivalHelper(root.right);

            int count = 1;
            boolean valid = true;
            //invalid if either below is invalid
            //or if both left and right are present and data is not equal
            if ((!leftResult.valid || !rightResult.valid) ||
                    ((root.left != null && root.right != null)
                            && (root.left.data != root.right.data))) {
                count = 0;
                valid = false;
            }

            return new Result(valid, count + leftResult.count + rightResult.count);
        }
    }


    public class Result {
        boolean valid;
        int count;

        public Result(boolean valid, int count) {
            this.valid = valid;
            this.count = count;
        }
    }

    public static class Node {
        Node left, right;
        int data;

        public Node(int d) {
            this(d, null, null);
        }

        public Node(int d, Node l, Node r) {
            this.data = d;
            this.left = l;
            this.right = r;
        }
    }
}
