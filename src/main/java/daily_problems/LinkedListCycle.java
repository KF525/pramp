package daily_problems;

public class LinkedListCycle {

    public boolean hasCycle(LLNode startNode) {
        if (startNode == null) return false;

        LLNode slow, fast;
        slow = fast = startNode; //initiate all nodes to startNode

        while (true) {
            slow = slow.next; // reassign slow, one hop

            if (fast.next != null) {
                fast = fast.next.next; // reassign fast, 2 hops
            } else {
                return false; //next node is null, we reached the end
            }

            if (slow == null || fast == null) { //if either nodes are null, we reached the end
                return false;
            }

            if (slow == fast) { //if the two ever meet
                return true;
            }
        }
    }
}

//O(n) time complexity
