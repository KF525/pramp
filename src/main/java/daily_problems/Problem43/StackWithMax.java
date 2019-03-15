package daily_problems.Problem43;

import java.util.Stack;

public class StackWithMax {
    /*
    implement stack with push, pop, and max returns the current max value in a stack
Implement a stack that has the following methods:

push(val), which pushes an element onto the stack
pop(), which pops off and returns the topmost element of the stack. If there are no elements in the stack, then it should throw an error or return null.
max(), which returns the maximum value in the stack currently. If there are no elements in the stack, then it should throw an error or return null.
Each method should run in constant time.
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
