class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return recur(0, n - 1, s, dp);
    }
    private int recur(int i, int j, String s, int[][] dp){
        if(i == j){
            return 1;
        }else if(i > j){
            return 0;
        }
        if(dp[i][j] != -1){
           return dp[i][j]; 
        }
        if(s.charAt(i) == s.charAt(j)){
            dp[i][j] = 2 + recur(i + 1, j - 1, s, dp);
            return dp[i][j];
        }
        int c1 = recur(i + 1, j, s, dp);
        int c2 = recur(i, j - 1, s, dp);
        dp[i][j] = Math.max(c1, c2);
        return dp[i][j];
    }
}