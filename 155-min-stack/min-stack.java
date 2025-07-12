public class MinStack {
    int size = 0;
    int lowest = 0;
    int[][] stack = new int[1][2];
    int[] pair = new int[2];

    public MinStack() {}
    
    public void push(int val) {
        if (size == stack.length) {
            int[][] copyStack = stack;
            stack = new int[stack.length * 2][2];
            for (int i = 0; i < copyStack.length; i++) {
                stack[i] = copyStack[i];
            }
        }
        pair = new int[2];
        lowest = (size != 0) && (val > lowest) ? lowest : val;
        pair[0] = val;
        pair[1] = (size > 0) && (val > lowest) ? lowest : val;
        stack[size] = pair;
        size++;
    }

    public void pop() {
        if (size <= 0)
            return;
        if (stack[size - 1][0] == lowest) {
            if ((size - 1) == 0) {
                lowest = stack[size - 1][1];
                pair = new int[2];
                pair[0] = 0;
                pair[1] = 0;
                stack[size - 1] = pair;
                size--;
                return;
            }
            lowest = stack[size - 2][1];
        }
        pair = new int[2];
        pair[0] = 0;
        pair[1] = 0;
        stack[size - 1] = pair;
        size--;
    }

    public int top() {
        if (size <= 0)
            return 0;
        return stack[size - 1][0];
    }

    public int getMin() {
        if (size <= 0)
            return 0;
        return stack[size - 1][1];
    }
}

