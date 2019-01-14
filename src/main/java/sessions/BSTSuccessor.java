package sessions;

public class BSTSuccessor {
    public TNode findInOrderSuccessor(TNode node) {
        if (node == null) {
            return null; //base case, if node null, return null
        } else {
            if (node.right == null) {
                return findSuccessorParent(node, node.value); //find parent successor
            } else {
                return findSuccessorChild(node.right); //go right once and then left as much as possible
            }
        }
    }

    private TNode findSuccessorChild(TNode node) {
        if (node.left == null) {
            return node;
        } else {
            return findInOrderSuccessor(node.left);
        }
    }

    private TNode findSuccessorParent(TNode node, Integer value) {
        if (node == null) {
            return null;
        } else if (node.value > value) {
            return node;
        } else {
            return findSuccessorParent(node.parent, value);
        }
    }

    static class TNode {
        int value;
        TNode left, right, parent;

        public TNode(int i) {
           new TNode(i, null, null);
        }

        public TNode(int i, TNode left, TNode right) {
            this.value = i;
            this.left = left;
            this.right = right;
            this.parent = null;
        }

        public void setParent(TNode parent) {
            this.parent = parent;
        }
    }
}
