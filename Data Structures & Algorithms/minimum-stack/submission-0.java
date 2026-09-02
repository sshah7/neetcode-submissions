class MinStack {
        Stack<Integer> store;
        Stack<Integer> minStack = new Stack<>();
    public MinStack() {
       store = new Stack<>();
    }
    
    public void push(int val) {
        int currentMin = minStack.isEmpty() ? val : Math.min(val, minStack.peek());
        store.push(val);
        minStack.push(currentMin);
    }
    
    public void pop() {
        minStack.pop();
        store.pop();
    }
    
    public int top() {
        return store.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
