class MyQueue {
    Stack<Integer> store;
    Stack<Integer> out;
    public MyQueue() {
        store = new Stack<>();
        out = new Stack<>();
    }
    
    public void push(int x) {
        store.push(x);
    }
    
    public int pop() {
        int s = store.size();
       if (out.isEmpty()) {
           while (!store.isEmpty()) {
               out.push(store.pop());
           }
       }
       return out.pop();
    }
    
    public int peek() {
       int s = store.size();
       if (out.isEmpty()) {
           while (!store.isEmpty()) {
               out.push(store.pop());
           }
       }
       return out.peek();
    }

    public boolean empty() {
        return store.isEmpty() && out.isEmpty();
}
}
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */