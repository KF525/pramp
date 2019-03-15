package daily_problems.Misc;

import daily_problems.Misc.ReverseInt;
import junit.framework.Assert;
import org.junit.Test;

public class ReverseIntTest {

    ReverseInt reverseInt = new ReverseInt();

    @Test
    public void reverseIntDoesRightThing() {
        Assert.assertEquals(321, reverseInt.reverseInt(123));
    }
}
