class MyStack {

    Queue<Integer> store;

    public MyStack() {
        store = new LinkedList<>();
    }
    
    public void push(int x) {
        store.add(x);
        int size = store.size();
        while (size > 1) {
            store.add(store.remove());
            size--;
        }
    }
    
    public int pop() {
        return store.remove();
    }
    
    public int top() {
        return store.peek();
    }
    
    public boolean empty() {
        return store.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */