class MinStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public MinStack() {
        // no-op
    }
    
    public void push(int value) {
        stack.push(value);
        if (minStack.empty()) {
            minStack.push(value);
            return;
        }
        if (value < minStack.peek()) {
            minStack.push(value);
        } else {
            minStack.push(minStack.peek());
        }
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
