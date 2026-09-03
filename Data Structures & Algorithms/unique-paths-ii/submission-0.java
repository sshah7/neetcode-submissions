class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m= obstacleGrid.length;
        int n= obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1) return 0;
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(obstacleGrid[i][j] != 1){
                    if(i == 0 && j == 0) continue;
                    int left = (j>0) ? dp[i][j-1] : 0;
                    int right = (i>0) ? dp[i-1][j] : 0;
                    dp[i][j] =left+right;
            }
        }
    }
        return dp[m-1][n-1];
    }
}