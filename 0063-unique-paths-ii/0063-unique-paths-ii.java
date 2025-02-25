class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return helper(m - 1 , n - 1, dp, obstacleGrid);
    }
    private int helper(int m, int n, int[][] dp, int[][] obstacleGrid){
        if(obstacleGrid[m][n] == 1) return 0;
        if(m == 0 && n == 0){
            return 1;
        }
        if(dp[m][n] != -1){
            return dp[m][n];
        }
        int cnt1 = 0;
        if(m > 0){
            cnt1 = helper(m - 1, n, dp, obstacleGrid);
        }
        int cnt2 = 0;
        if(n > 0){
            cnt2 = helper(m, n - 1, dp, obstacleGrid);
        }
        dp[m][n] = cnt1 + cnt2;
        return dp[m][n];
    }
}