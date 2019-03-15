package daily_problems.Misc;

import java.util.LinkedList;
import java.util.Queue;

public class TwoQueuesAsStack {
    Queue<Integer> stack1 = new LinkedList<>();
    Queue<Integer> stack2 = new LinkedList<>();

    public boolean push(Integer i) {
        if (!stack2.isEmpty()) {
            stack2.add(i);
        } else {
            stack1.add(i);
        }
        return true;
    }

    public Integer pop() {
        if (stack1.isEmpty()) { //move items to stack2 except last item
            return retrieveItem(stack2, stack1);
        } else {
            return retrieveItem(stack1, stack2);
        }
    }


    public Integer retrieveItem(Queue<Integer> stackToEmpty, Queue<Integer> stackToFill) {
        while (stackToEmpty.size() > 1) {
            stackToFill.add(stackToEmpty.remove());
        }
        return stackToEmpty.remove();
    }
}

/*
Stack is LIFO
queue1: [3 6 9] => queue2: [3,6], remove from queue1.
add to whichever queue has elements in it
relocate all values (except last one which will be popped) to the empty queue
push 1,2,3 / pop 3

[ 3, 2, 1] => [ 2, 1]

*/
