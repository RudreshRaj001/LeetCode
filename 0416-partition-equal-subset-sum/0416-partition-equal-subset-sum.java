class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int a : nums) {
            sum += a;
        }
        if (sum % 2 != 0)
            return false;
        sum /= 2;
        int[][] dp = new int[nums.length + 1][sum + 1];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        return helper(nums, sum, 0, dp);
    }

    private boolean helper(int[] nums, int target, int i, int[][] dp) {
        if (i == nums.length || target < 0) {
            return target == 0;
        }
        if (dp[i][target] != -1) {
            return dp[i][target] == 1;
        }
        boolean pick = helper(nums, target - nums[i], i + 1, dp);
        boolean nopick = helper(nums, target, i + 1, dp);
        if (pick || nopick) {
            dp[i][target] = 1;
        } else {
            dp[i][target] = 0;
        }
        return dp[i][target] == 1;
    }
}