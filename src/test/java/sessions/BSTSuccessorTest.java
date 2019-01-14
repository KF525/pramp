package sessions;

import org.junit.Assert;
import org.junit.Test;

public class BSTSuccessorTest {

    BSTSuccessor bstSuccessor = new BSTSuccessor();

    @Test
    public void findInOrderSuccessorReturnsFirstLargerNode() {
        BSTSuccessor.TNode eleven = new BSTSuccessor.TNode(11);
        BSTSuccessor.TNode fourteen = new BSTSuccessor.TNode(14);
        BSTSuccessor.TNode five = new BSTSuccessor.TNode(5);
        BSTSuccessor.TNode twelve = new BSTSuccessor.TNode(12, eleven, fourteen);
        BSTSuccessor.TNode nine = new BSTSuccessor.TNode(9, five, twelve);
        BSTSuccessor.TNode twentyFive = new BSTSuccessor.TNode(25);
        BSTSuccessor.TNode root = new BSTSuccessor.TNode(20, nine, twentyFive);
        twentyFive.setParent(root);
        nine.setParent(root);
        five.setParent(nine);
        twelve.setParent(nine);
        eleven.setParent(twelve);
        fourteen.setParent(twelve);

        //Assert.assertEquals(root, bstSuccessor.findInOrderSuccessor(fourteen));
        //Assert.assertEquals(null, bstSuccessor.findInOrderSuccessor(twentyFive));

        Assert.assertEquals(twentyFive, bstSuccessor.findInOrderSuccessor(root));
        Assert.assertEquals(fourteen, bstSuccessor.findInOrderSuccessor(twelve));
        Assert.assertEquals(twelve, bstSuccessor.findInOrderSuccessor(nine));
        Assert.assertEquals(nine, bstSuccessor.findInOrderSuccessor(five));

    }
}
