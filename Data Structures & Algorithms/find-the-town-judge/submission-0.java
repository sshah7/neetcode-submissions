class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] store = new int[n + 1];

        for(int i=0; i<trust.length; i++){
            store[trust[i][0]]--;
            store[trust[i][1]]++;
        }

        for(int i = 1; i <= n; i++) {
            if (store[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }
}