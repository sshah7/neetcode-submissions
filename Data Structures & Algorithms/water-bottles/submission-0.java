class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int maxCount = numBottles;
        int emptyBottles = numBottles;
        while(emptyBottles >= numExchange){
            maxCount+=1;
            emptyBottles = emptyBottles - numExchange+1;
        }
        return maxCount;
    }
}
