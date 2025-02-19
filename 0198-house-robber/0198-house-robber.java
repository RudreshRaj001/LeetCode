class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return helper(nums, dp, n - 1);
    }
    private int helper(int[] nums, int[] dp, int n){
        if(n == 0) return nums[0];
        if(n == -1) return 0;
        if(dp[n] != -1){
            return dp[n];
        }
        int pick = nums[n] + helper(nums, dp, n - 2);
        int nopick =  helper(nums, dp, n - 1);
        dp[n] = Math.max(pick, nopick);;
        return dp[n];
    }
}