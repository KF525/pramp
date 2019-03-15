package daily_problems.Problem73;

import junit.framework.Assert;
import org.junit.Test;

public class ReverseSinglyLinkedListTest {

    ReverseSinglyLinkedList reverseSinglyLinkedList = new ReverseSinglyLinkedList();

    @Test
    public void reverseReturnsReversedLinkedList() {
        ReverseSinglyLinkedList.Node n = new ReverseSinglyLinkedList.Node(1);
        n.next = new ReverseSinglyLinkedList.Node(2);
        n.next.next = new ReverseSinglyLinkedList.Node(3);

        ReverseSinglyLinkedList.Node result = reverseSinglyLinkedList.reverse(n);
        Assert.assertEquals(3, result.data);
        Assert.assertEquals(2, result.next.data);
        Assert.assertEquals(1, result.next.next.data);
    }

    @Test
    public void reverseInPlaceReturnsReveredLinkedList() {
        ReverseSinglyLinkedList.Node n = new ReverseSinglyLinkedList.Node(1);
        n.next = new ReverseSinglyLinkedList.Node(2);
        n.next.next = new ReverseSinglyLinkedList.Node(3);

        ReverseSinglyLinkedList.Node result = reverseSinglyLinkedList.reverseInPlace(n);
        Assert.assertEquals(3, result.data);
        Assert.assertEquals(2, result.next.data);
        Assert.assertEquals(1, result.next.next.data);
    }
}
