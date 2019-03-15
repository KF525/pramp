package daily_problems.Problem20;

import daily_problems.Problem20.IntersectingNode;
import org.junit.Assert;
import org.junit.Test;

public class IntersectingNodeTest {

    IntersectingNode intersectingNode = new IntersectingNode();

    @Test
    public void findIntersectionReturnsIntersectingNode() {

        IntersectingNode.Node list1_a = new IntersectingNode.Node(5);
        IntersectingNode.Node list1_b = new IntersectingNode.Node(6);
        IntersectingNode.Node list1_c = new IntersectingNode.Node(7);
        IntersectingNode.Node list1_d = new IntersectingNode.Node(8);
        IntersectingNode.Node list1_e = new IntersectingNode.Node(10);

        list1_a.next = list1_b;
        list1_b.next = list1_c;
        list1_c.next = list1_d;
        list1_e.next =list1_e;

        IntersectingNode.Node list2_a = new IntersectingNode.Node(3);
        IntersectingNode.Node list2_b = new IntersectingNode.Node(4);
        IntersectingNode.Node list2_c = list1_d;
        IntersectingNode.Node list2_d = new IntersectingNode.Node(9);

        list2_a.next = list2_b;
        list2_b.next = list2_c;
        list2_c.next = list2_d;

        Assert.assertEquals(8, intersectingNode.findIntersection(list1_a, list2_a).data);
    }
}
