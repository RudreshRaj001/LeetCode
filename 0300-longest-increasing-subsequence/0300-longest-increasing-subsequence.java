class Solution {
    public int lengthOfLIS(int[] nums) {
        int ans = 0;
        int n = nums.length;
        int[][] dp = new int[n][n + 1];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        return helper(nums, n - 1, n, dp);
    }
    private int helper(int[] nums, int ind, int prev, int[][] dp){
        if(ind < 0) return 0;

        if(dp[ind][prev] != -1) return dp[ind][prev];
        int take = 0;
        if(prev == nums.length || nums[ind] < nums[prev]){
            take =  1 + helper(nums, ind - 1, ind, dp);
        }
        int noTake = helper(nums, ind - 1, prev, dp);
        dp[ind][prev] = Math.max(take, noTake);
        return dp[ind][prev];
    }
}