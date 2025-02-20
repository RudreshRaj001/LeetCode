class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        int[] dp2 = new int[n];
        Arrays.fill(dp2, -1);
        int ans = Math.max(helper(nums, dp2, n - 2, false), helper(nums, dp, n - 1, true));
        return ans;
    }

    private int helper(int[] nums, int[] dp, int n, boolean flag) {
        if (n == 0 && flag) {
            return 0;
        } else if (n == 0) {
            return nums[0];
        }
        if (n == -1)
            return 0;
        if (dp[n] != -1)
            return dp[n];
        int pick = nums[n] + helper(nums, dp, n - 2, flag);
        int nopick = helper(nums, dp, n - 1, flag);
        dp[n] = Math.max(pick, nopick);
        return dp[n];
    }
}