package daily_problems;

import java.util.HashSet;
import java.util.Set;

public class IntersectingNode {

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
