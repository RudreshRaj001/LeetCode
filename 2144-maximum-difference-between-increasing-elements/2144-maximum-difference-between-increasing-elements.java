class Solution {
    public int maximumDifference(int[] nums) {
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                ans = Math.max(nums[j] - nums[i], ans);
            }
        }
        return ans <= 0 ? -1 : ans;
    }
}