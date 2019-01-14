package daily_problems;

import org.junit.Assert;
import org.junit.Test;

public class RemoveKElementFromLinkedListTest {

    RemoveKElementFromLinkedList removeKElementFromLinkedList = new RemoveKElementFromLinkedList();

    @Test
    public void returnKNodeReturnsCorrectNode() {

        LLNode node1 = new LLNode(1, null);
        LLNode node2 = new LLNode(2, node1);
        LLNode node3 = new LLNode(3, node2);
        LLNode node4 = new LLNode(4, node3);
        LLNode node5 = new LLNode(5, node4);
        Assert.assertEquals(node3, removeKElementFromLinkedList.returnKNode(node5, 3));
    }
}
