package daily_problems.Problem6;

public class XORLinkedList {
/*
An XOR linked list is a more memory efficient doubly linked list.
Instead of each node holding next and prev fields, it holds a field named both,
which is an XOR of the next node and the previous node.
Implement an XOR linked list; it has an add(element) which adds the element to the end,
and a get(index) which returns the node at index.
*/

    public boolean add(int data) { //add element to end of linkedlist
        //traverse the list until the next item is null
        //on the last item XOr both value with data of element about to be added
        return false;
    }

    public XORLL get(int i) { //find node at given index
        return null;
    }

    public class XORLL {
        int data;
        int both; //XOR of next and previous
    }
}


/*
Linked List

Node {int data, int both}
Ndoe{2, }
 */