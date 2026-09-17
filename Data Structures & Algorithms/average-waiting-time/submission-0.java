class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        double finishTime = 0;
        double waitTime=0;
        double startTime=0;
        double endTime=0;

        for(int i=0; i<customers.length; i++){
            startTime = Math.max(customers[i][0], finishTime);
            endTime = startTime + customers[i][1];
            finishTime = endTime;
            waitTime += endTime - customers[i][0];
        }
        return (double)waitTime/n;
    
    }
}