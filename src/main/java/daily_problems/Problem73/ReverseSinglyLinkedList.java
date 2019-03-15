package daily_problems.Problem73;

import java.util.Stack;

public class ReverseSinglyLinkedList {
/*
Given the head of a singly linked list, reverse it in-place.
    1 -> 2 -> 3 -> null
    3 -> 2 -> 1 -> null
    stack: 1,2,3
*/

    //https://www.geeksforgeeks.org/reverse-a-linked-list/
    public Node reverseInPlace(Node head) { //1->2->3->null ==>  1->null
        Node prev = null;
        Node current = head; //1
        Node next = null;

        while (current != null) {
            next = current.next; //next = 2
            current.next = prev; //1.next -> null
            prev = current; //prev = 1
            current = next; //current = 2
        }

        return prev;
    }

    public Node reverse(Node head) {
        Stack<Node> stack = new Stack();

        while (head != null) {
            stack.add(head);
            head = head.next; //be careful fo reassigning head
        }

        Node currentNode = stack.pop();
        Node newHead = currentNode;
        while (!stack.isEmpty()) {
            Node nextNode = stack.pop();
            currentNode.next = nextNode;
            currentNode = nextNode;
        }

        currentNode.next = null;
        return newHead;
    }


    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
