package daily_problems.Problem20;

import java.util.HashSet;
import java.util.Set;

public class IntersectingNode {
/*
Given two singly linked lists that intersect at some point, find the intersecting node. The lists are non-cyclical.

For example, given A = 3 -> 7 -> 8 -> 10 and B = 99 -> 1 -> 8 -> 10, return the node with value 8.

In this example, assume nodes with the same value are the exact same node objects.

Do this in O(M + N) time (where M and N are the lengths of the lists) and constant space.
 */
    //given two singly linked lists - find intersecting node
    public Node findIntersection(Node list1, Node list2) {
        Set<Node> seenNodes = new HashSet<>();

        while (list1 != null) {
            seenNodes.add(list1);
            list1 = list1.next;
        }

        while (list2 != null) {
            if (seenNodes.contains(list2)) {
                return list2;
            } else {
                list2 = list2.next;
            }
        }

        return null; //there is no intersecting nodes
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
