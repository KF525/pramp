package sessions;

import com.sun.tools.javac.util.List;
import org.junit.Assert;
import org.junit.Test;

public class SalesPathTest {

    SalesPath salesPath = new SalesPath();

    @Test
    public void getCheapestPathReturnsSmallestPathSum() {
        SalesPath.TNode tNode0 = new SalesPath.TNode(0);
        SalesPath.TNode tNode1 = new SalesPath.TNode(5);
        SalesPath.TNode tNode2 = new SalesPath.TNode(3);
        SalesPath.TNode tNode3 = new SalesPath.TNode(6);
        SalesPath.TNode tNode4 = new SalesPath.TNode(4);
        SalesPath.TNode tNode5 = new SalesPath.TNode(2);
        SalesPath.TNode tNode6 = new SalesPath.TNode(0);
        SalesPath.TNode tNode7 = new SalesPath.TNode(1);
        SalesPath.TNode tNode8 = new SalesPath.TNode(5);
        SalesPath.TNode tNode9 = new SalesPath.TNode(1);
        SalesPath.TNode tNode10 = new SalesPath.TNode(10);
        SalesPath.TNode tNode11 = new SalesPath.TNode(1);

        tNode9.setChildren(List.of(tNode11));
        tNode6.setChildren(List.of(tNode10));
        tNode5.setChildren(List.of(tNode9));
        tNode2.setChildren(List.of(tNode5, tNode6));
        tNode1.setChildren(List.of(tNode4));
        tNode3.setChildren(List.of(tNode7, tNode8));
        tNode0.setChildren(List.of(tNode1, tNode2, tNode3));

        Assert.assertEquals(7, salesPath.getCheapestCost(tNode0));
    }
}
