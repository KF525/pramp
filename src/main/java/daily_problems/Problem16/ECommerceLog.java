package daily_problems.Problem16;

import java.util.LinkedList;

public class ECommerceLog {
    /*
    You run an e-commerce website and want to record the last N order ids in a log. Implement a data structure to accomplish this, with the following API:

record(order_id): adds the order_id to the log
get_last(i): gets the ith last element from the log. i is guaranteed to be smaller than or equal to N.
     */
    int capacity;
    LinkedList<OrderId> orderIdLog = new LinkedList<>();

    public void record(OrderId orderId) {
        if (orderIdLog.size() == capacity) {
            orderIdLog.removeLast();
        }
        orderIdLog.add(0, orderId);
    }

    public OrderId getLast(int i) {
        return orderIdLog.get(i - 1);  //not sure what is being passed in here exactly?
    }

    static class OrderId {
        int orderId;

        public OrderId(int orderId) {
            this.orderId = orderId;
        }
    }

    public ECommerceLog(int capacity) {
        this.capacity = capacity;
    }

    // () -> () -> () -> () -> () -> ()
    // [id3] [id2] [id1]; add an order: [id4] [id3] [id2]
    // data structure should be of fixed N size
    // Issue: How to get to the ith element quickly?
    // Straightforward approach, iterate through the linked list the correct number of times and then start recording until you hit end of list.
}
