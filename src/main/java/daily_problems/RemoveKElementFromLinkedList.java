package daily_problems;

public class RemoveKElementFromLinkedList {

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
}

//start one pointer
//start another pointer after k
//when first pointer is null
//return the element at the second pointer


