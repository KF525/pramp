package daily_problems;

import java.util.Stack;

public class StackWithMax {
    /*
    implement stack with push, pop, and max returns the current max value in a stack
    each should run in constant time
    */

    Stack<IntegerWithMax> stack = new Stack<>(); //may I use a stack or array with pointers?

    public void push(Integer i) {
        if (stack.isEmpty()) {
            stack.push(new IntegerWithMax(i, i));
        } else {
            IntegerWithMax current = stack.peek();
            if (current.max < i) {
                stack.push(new IntegerWithMax(i, i));
            } else {
                stack.push(new IntegerWithMax(i, current.max));
            }
        }
    }

    public IntegerWithMax pop() {
        if (stack.isEmpty()) {
            throw new NullPointerException("Nothing in stack");
        } else {
            return stack.pop();
        }
    }

    public int max() {
        return stack.peek().max;
    }

    class IntegerWithMax {
        int value;
        int max;


        public IntegerWithMax(int value, int max) {
            this.value = value;
            this.max = max;
        }
    }
}
