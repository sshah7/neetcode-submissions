class FirstUnique {
    Queue<Integer> qu;
    Map<Integer,Integer> count = new HashMap<>();
    public FirstUnique(int[] nums) {
        qu = new ArrayDeque<>();
        for (int num : nums) {
            add(num);
        }
    }
    
    public int showFirstUnique() {
        while (!qu.isEmpty() && count.get(qu.peek()) > 1) {
            qu.poll();
        }
        return qu.isEmpty() ? -1 : qu.peek();
    }
    
    public void add(int value) {
        qu.offer(value);
        count.put(value, count.getOrDefault(value, 0) + 1);
    }
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */
