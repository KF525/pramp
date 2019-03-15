package daily_problems.Problem74;

import junit.framework.Assert;
import org.junit.Test;

public class MultiplicationTableTest {

    MultiplicationTable multiplicationTable = new MultiplicationTable();

    @Test
    public void appearancesOfXinNxNReturnsCorrectCount() {
        int appearances1 = multiplicationTable.appearancesOfXinNxN(12, 6);
        Assert.assertEquals(4, appearances1);

        int appearances2 = multiplicationTable.appearancesOfXinNxN(36, 6);
        Assert.assertEquals(1, appearances2);

        int appearances3 = multiplicationTable.appearancesOfXinNxN(50, 100);
        Assert.assertEquals(6, appearances3); //1 2 5 10 25 50
    }
}
