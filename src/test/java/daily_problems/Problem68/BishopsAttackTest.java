package daily_problems.Problem68;

import daily_problems.Problem68.BishopsAttack.Bishop;
import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BishopsAttackTest {

    BishopsAttack bishopsAttack = new BishopsAttack();

    @Test
    public void numberOfAttackingBishopsReturnsCorrectNumber() {
        Bishop bishop1 = new Bishop(0, 0);
        Bishop bishop2 = new Bishop(1, 2);
        Bishop bishop3 = new Bishop(2, 2);
        Bishop bishop4 = new Bishop(4, 0);
        List<Bishop> bishops = new ArrayList();
        bishops.add(bishop1);
        bishops.add(bishop2);
        bishops.add(bishop3);
        bishops.add(bishop4);
        Assert.assertEquals(2, bishopsAttack.numberOfAttackingBishops(bishops));
    }
}
