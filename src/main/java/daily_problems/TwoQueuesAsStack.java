package daily_problems;

public class TwoQueuesAsStack {
//    Queue<Integer> stack1 = new LinkedList<>();
//    Queue<Integer> stack2 = new LinkedList<>();
//
//    public boolean push(Integer i) {
//        if (!stack2.isEmpty()) {
//            stack2.add(i);
//        } else {
//            stack1.add(i);
//        }
//        return true;
//    }
//
//    public Integer pop() {
//        if (stack1.isEmpty()) {
//            //move items to stack2 except last item
//        } else {
//            //move itesm to stack1 except last item
//        }
//    }
//
//    public Integer moveElements() {
//        while ()
//    }
}

/*
Stack is LIFO
queue1: [3 6 9] => queue2: [3,6], remove from queue1.
add to whichever queue has elements in it
relocate all values (except last one which will be popped) to the empty queue
*/
