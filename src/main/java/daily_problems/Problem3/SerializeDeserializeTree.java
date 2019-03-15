package daily_problems.Problem3;

public class SerializeDeserializeTree {

    /*
    Given the root to a binary tree, implement serialize(root), which serializes the tree into a string,
    and deserialize(s), which deserializes the string back into the tree.

For example, given the following Node class

class Node:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
The following test should pass:

node = Node('root', Node('left', Node('left.left')), Node('right'))
assert deserialize(serialize(node)).left.left.val == 'left.left'
     */

    public Node deserialize(String tree) { // Node(1, Node(2, null, null), Node(3, null, null))
        if (tree.startsWith("null")) return null;
        int firstParen = tree.indexOf('(');
        int firstComma = tree.indexOf(',');

        String left = leftString(tree.substring(firstComma + 1));
        Node leftNode = deserialize(left);
        Node rightNode = deserialize(rightString(tree.substring(firstComma + 1), left));

        return new Node(Integer.parseInt(tree.substring(firstParen + 1, firstComma)),
                    leftNode, rightNode);

    }

    private String leftString(String tree) { //Node(2,null,null),Node(3,null,null));
        if (tree.startsWith("Node")) {
            int parensCount = 0;
            for (int i = 0; i < tree.length(); i++) {
                if (tree.charAt(i) == '(') {
                    parensCount++;
                }
                if (tree.charAt(i) == ')') {
                    parensCount--;
                    if (parensCount == 0) {
                        System.out.println("left is " +  tree.substring(0, i + 1));
                        return tree.substring(0, i + 1);
                    }
                }
            }
        }
        return "null";
    }

    private String rightString(String tree, String leftString) { //Node(2,null,null),Node(3,null,null));
        int startOfRight = leftString.length() + 1;
        return tree.substring(startOfRight, tree.length() - 1);
    }

    public String serialize(Node tree) {
        if (tree == null) return "null";
        return "Node(" + tree.data + "," + serialize(tree.left) + "," + serialize(tree.right) + ")";
    }

    public class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

}
