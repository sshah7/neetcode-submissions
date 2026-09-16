class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
       Queue<Integer> que = new ArrayDeque<>();
       for(int i = 0; i < tickets.length; i++){
            que.offer(i);
       }
       int time=0;

       while(que.size()>0){
            int indx = que.poll();
            tickets[indx]--;
            time++;
            if(indx == k && tickets[indx] == 0){
                return time;
            }
            if(tickets[indx] > 0){
                que.offer(indx);
            }
       }
       return time;
    }
}