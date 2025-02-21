class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n][m];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        } 
        return recur(n - 1, m - 1, text1, text2, dp);
    }
    private int recur(int i, int j, String text1, String text2, int[][] dp){
        if(i < 0 || j < 0){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(text1.charAt(i) == text2.charAt(j)){
            dp[i][j] = 1 + recur(i - 1, j - 1, text1, text2, dp);
            return dp[i][j];
        }else{
            int case1 = recur(i - 1, j, text1, text2, dp);
            int case2 = recur(i, j - 1, text1, text2, dp);
            dp[i][j] = Math.max(case1, case2);
            return dp[i][j];
        }
    }
}