package daily_problems.Problem18;

public class MaxSubArrayOfLengthK {

    /*
    Given an array of integers and a number k, where 1 <= k <= length of the array, compute the maximum values of each subarray of length k.

For example, given array = [10, 5, 2, 7, 8, 7] and k = 3, we should get: [10, 7, 8, 8], since:

10 = max(10, 5, 2)
7 = max(5, 2, 7)
8 = max(2, 7, 8)
8 = max(7, 8, 7)
Do this in O(n) time and O(k) space. You can modify the input array in-place and you do not need to store the results. You can simply print them out as you compute them.
     */
    public int[] maxSubArray(int[] array, int k) {
        if (array.length == 0) return null;
        if (k > array.length) return null;
        int[] result = new int[array.length - k + 1];
        for (int i = 0; i < array.length - k + 1; i++) {
            int max = getMaxValue(array, i, i+k, Integer.MIN_VALUE);
            result[i] = max;
        }
        return result;
    }

    public int getMaxValue(int[] array, int start, int stop, int currentMax) {
       if (start==stop) return currentMax;
       return getMaxValue(array, start+1, stop, Math.max(array[start], currentMax));
    }
}

/*
[10,5,2,7,8,7], k=3 => [10. 7,8,8]
 */


/*
  static ArrayList<LLNode> toLinkedList(Node root){
    List<LLNode> nodeList = new ArrayList();
    helper(nodeList, root, 0);

    return nodeList;
  }

  static void helper(ArrayList<LLNode> list, Node root, int level) {
    //see if list has that level already
    if (root == null) return;

    if (list.size() < level) {
      list.add(new LLNode(root.data));
    } else {
       //if it does not, create a linked list with that item and add it to list
      LLNode currentNode = list.get(level);
      LLNode newNode = new LLNode(root.data);
      newNode.next = currentNode;
      list.set(level,newNode);
    }

    helper(list, root.left, level+1);
    helper(list, root.right, level+1);
    //call the function again with all its children, updated list, updated level
  }

  class LLNode {
    int data;
    LLNode next;

    public LLNode(int data) {
      this.data = data;
      this.next = null;
    }
  }

  class Node {
    int data;
    Node left, right;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }
 */