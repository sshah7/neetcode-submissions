class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> preq = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone: stones){
            preq.add(stone);
        }
        while(preq.size() > 1 ){
            int x= preq.poll();
            int y= preq.poll();
            if(x!=y){
                preq.add(x-y);
            }
        }
        return preq.isEmpty() ? 0   :   preq.peek();   
    }
}
