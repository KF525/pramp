package daily_problems.Problem53;

import java.util.Stack;

public class TwoStacksAsQueue {
    /*
    Implement a queue using two stacks. Recall that a queue is a FIFO (first-in, first-out) data structure with the following methods: enqueue, which inserts an element into the queue, and dequeue, which removes it.
     */
    Stack<Integer> enqueueStack = new Stack<>();
    Stack<Integer> dequeueStack = new Stack<>();

    public boolean enqueue(Integer i) {
        enqueueStack.push(i);
        return true;
    }

    public Integer dequeue() {
        if (!dequeueStack.isEmpty()) { //if pop stack is not empty, take from thereTwoStacksAsQueue
            return dequeueStack.pop();
        } else if (!enqueueStack.isEmpty()) {  //if pop stack is empty, put everything from push to popstack
            addToPopStack();
            return dequeueStack.pop();
        } else {
            return null;
        }
    }

    public void addToPopStack() {
        while (!enqueueStack.isEmpty()) {
            dequeueStack.push(enqueueStack.pop());
        }
    }

    public Integer peek() {
        if (!dequeueStack.isEmpty()) {
            return dequeueStack.peek();
        } else if (!enqueueStack.isEmpty()) {
            addToPopStack();
            return dequeueStack.peek();
        } else {
            return null;
        }
    }
}
