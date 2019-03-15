package daily_problems.Problem3;

import daily_problems.Problem3.SerializeDeserializeTree;
import junit.framework.Assert;
import org.junit.Test;

public class SerializeDeserializeTreeTest {

    SerializeDeserializeTree serializeDeserializeTree = new SerializeDeserializeTree();

    @Test
    public void deserializeDoesTheRightThing() {
        String node = "Node(1,Node(2,null,null),Node(3,null,null))";
        SerializeDeserializeTree.Node tree = serializeDeserializeTree.deserialize(node);
        Assert.assertEquals(node, serializeDeserializeTree.serialize(tree));
    }
}
