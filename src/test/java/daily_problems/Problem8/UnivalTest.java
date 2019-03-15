package daily_problems.Problem8;

import daily_problems.Problem8.Unival;
import org.junit.Assert;
import org.junit.Test;

public class UnivalTest {

    Unival unival = new Unival();

    @Test
    public void countUnivalReturnsTheCorrectNumberOfUnivals() {
        Unival.Node node0d = new Unival.Node(0);
        Unival.Node node1e = new Unival.Node(1);
        Unival.Node node1f = new Unival.Node(1);
        Unival.Node node1c = new Unival.Node(1, node1e, node1f);
        Unival.Node node0b = new Unival.Node(0, node1c, node0d);
        Unival.Node node1a = new Unival.Node(1);
        Unival.Node root = new Unival.Node(0, node1a, node0b);

        Assert.assertEquals(5, unival.countUnival(root));
    }
}
