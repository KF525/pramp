package sessions;

public class LargestSmallerBST {
    /*
    Given a root of a Binary Search Tree (BST) and a number num, implement an efficient function findLargestSmallerKey that finds the largest key in the tree that is smaller than num.
    If such a number doesn’t exist, return -1. Assume that all keys in the tree are nonnegative.
    */
    Node root;

    int findLargestSmallerKey(int num) {
        return findLargestSmallerKeyHelper(num, root);
    }

    int findLargestSmallerKeyHelper(int num, Node node) {
        //if it is smaller than the leftmost node, then return -1
        //if it is largest than the rightmost node, then return node
        //if it is smaller than the node and there is a parent then return parent
        //if it is smaller than the node go right
        //if it is larger than the node go left

        if (num < node.key && node.left == null) return -1;
        if (num > node.key && node.right == null) return node.key;
        if (num < node.key && node.parent != null && num > node.parent.key) return node.parent.key;
        if (num > node.key) return findLargestSmallerKeyHelper(num, node.right);
        else return findLargestSmallerKeyHelper(num, node.left);
    }

    void insert(int key) {

        // 1) If the tree is empty, create the root
        if(this.root == null) {
            this.root = new Node(key);
            return;
        }

        // 2) Otherwise, create a node with the key
        //    and traverse down the tree to find where to
        //    to insert the new node
        Node currentNode = this.root;
        Node newNode = new Node(key);

        while(currentNode != null) {
            if(key < currentNode.key) {
                if(currentNode.left == null) {
                    currentNode.left = newNode;
                    newNode.parent = currentNode;
                    break;
                } else {
                    currentNode = currentNode.left;
                }
            } else {
                if(currentNode.right == null) {
                    currentNode.right = newNode;
                    newNode.parent = currentNode;
                    break;
                } else {
                    currentNode = currentNode.right;
                }
            }
        }
    }

    public class Node {
        int key;
        Node left;
        Node right;
        Node parent;

        Node(int key) {
            this.key = key;
            left = null;
            right = null;
            parent = null;
        }
    }
}
