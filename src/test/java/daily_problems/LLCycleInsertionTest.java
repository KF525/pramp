package daily_problems;

public class LLCycleInsertionTest {

    LLCycleInsertion llCycleInsertion = new LLCycleInsertion();

//    @Test
//    public void insertShouldHandleSingleNodeCycle() {
//
//        LLNode node1 = new LLNode(1, null);
//        node1.setNext(node1);
//
//        LLNode node = llCycleInsertion.insert( node1, 2);
//        Assert.assertEquals(2, node.next.data);
//        Assert.assertEquals(1, node.next.next.data);
//    }
//
//    @Test
//    public void insertShouldInsertAValueInMiddleOfCycle() {
//
//        LLNode node2 = new LLNode(2, null);
//        LLNode node3 = new LLNode(3, null);
//        LLNode node5 = new LLNode(5, null);
//        node2.setNext(node3);
//        node3.setNext(node5);
//        node5.setNext(node2);
//
//        LLNode node = llCycleInsertion.insert(node2, 4);
//        Assert.assertEquals(5, node.next.data);
//    }
}
