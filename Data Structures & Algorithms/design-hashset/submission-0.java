class MyHashSet {

    Set<Integer> store = new HashSet<>();
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        store.add(key);
    }
    
    public void remove(int key) {
        store.remove(key);
    }
    
    public boolean contains(int key) {
        return store.contains(key);
    }
}