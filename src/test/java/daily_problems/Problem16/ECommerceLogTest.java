package daily_problems.Problem16;


import daily_problems.Problem16.ECommerceLog;
import junit.framework.Assert;
import org.junit.Test;

public class ECommerceLogTest {

    @Test
    public void recordAddsOrderIdsToLog() {
        ECommerceLog eCommerceLog = new ECommerceLog(3);

        ECommerceLog.OrderId orderId1 = new ECommerceLog.OrderId(1);
        eCommerceLog.record(orderId1);
        Assert.assertEquals(1, eCommerceLog.orderIdLog.size());
        ECommerceLog.OrderId orderId2 = new ECommerceLog.OrderId(2);
        eCommerceLog.record(orderId2);
        Assert.assertEquals(2, eCommerceLog.orderIdLog.size());
        ECommerceLog.OrderId orderId3 = new ECommerceLog.OrderId(3);
        eCommerceLog.record(orderId3);
        Assert.assertEquals(3, eCommerceLog.orderIdLog.size());
        Assert.assertEquals(orderId3, eCommerceLog.orderIdLog.get(0));
        Assert.assertEquals(orderId2, eCommerceLog.orderIdLog.get(1));
        Assert.assertEquals(orderId1, eCommerceLog.orderIdLog.get(2));
    }

    @Test
    public void recordHandlesWhenLogIsFull() {
        ECommerceLog eCommerceLog = new ECommerceLog(2);

        ECommerceLog.OrderId orderId1 = new ECommerceLog.OrderId(1);
        eCommerceLog.record(orderId1);
        Assert.assertEquals(1, eCommerceLog.orderIdLog.size());
        ECommerceLog.OrderId orderId2 = new ECommerceLog.OrderId(2);
        eCommerceLog.record(orderId2);
        Assert.assertEquals(2, eCommerceLog.orderIdLog.size());
        ECommerceLog.OrderId orderId3 = new ECommerceLog.OrderId(3);
        eCommerceLog.record(orderId3);
        Assert.assertEquals(2, eCommerceLog.orderIdLog.size());
        Assert.assertEquals(orderId3, eCommerceLog.orderIdLog.get(0));
        Assert.assertEquals(orderId2, eCommerceLog.orderIdLog.get(1));
    }

    @Test
    public void getLastReturnsCorrectOrderId() {
        ECommerceLog eCommerceLog = new ECommerceLog(2);
        ECommerceLog.OrderId orderId1 = new ECommerceLog.OrderId(1);
        eCommerceLog.record(orderId1);
        Assert.assertEquals(1, eCommerceLog.orderIdLog.size());
        ECommerceLog.OrderId orderId2 = new ECommerceLog.OrderId(2);
        eCommerceLog.record(orderId2);
        Assert.assertEquals(orderId2, eCommerceLog.getLast(1)); //first item in log
        Assert.assertEquals(orderId1, eCommerceLog.getLast(2)); //second item in log
        //is this the correct assertion??
    }

}
