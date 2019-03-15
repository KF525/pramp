package daily_problems.Problem26;

public class RemoveKElementFromLinkedList {
/*
Given a singly linked list and an integer k, remove the kth last element from the list. k is guaranteed to be smaller than the length of the list.

The list is very long, so making more than one pass is prohibitively expensive.

Do this in constant space and in one pass.
 */
    public LLNode returnKNode(LLNode n, int k) {
        LLNode root = n;

        while (k > 0) {
            n = n.next;
            k = k - 1;
        }

        while (n != null) {
            root = root.next;
            n = n.next;
        }

        return root;
    }

    class LLNode {
        int data;
        LLNode next;

        public void setNext(LLNode next) {
            this.next = next;
        }

        public LLNode(int data, LLNode next) {
            this.data = data;
            this.next = next;
        }
    }
}

//start one pointer
//start another pointer after k
//when first pointer is null
//return the element at the second pointer


