package daily_problems.Misc;

import java.util.Stack;

public class LargestStack {
    Stack<Int> stack = new Stack();

    public void push(int value) {
        int max = getMax();
        if (max < value) {
            stack.push(new Int(value, value));
        } else {
            stack.push(new Int(value, max));
        }
    }

    public Int pop() {
        return stack.pop();
    }

    public int getMax() {
      if (!stack.isEmpty()) {
          Int i = stack.peek();
          return i.max;
      } else {
          return Integer.MIN_VALUE;
      }
    }


    public class Int {
        int value;
        int max;

        public Int(int value, int max) {
            this.value = value;
            this.max = max;
        }
    }
}

/*
You can also do this by creating two stacks -- having one for the maxes.
 */