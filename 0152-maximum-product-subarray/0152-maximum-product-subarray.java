class Solution {
    public int maxProduct(int[] nums) {
        int res = nums[0];
        int curMin = nums[0];
        int curMax = nums[0];
        for(int i = 1; i < nums.length; i++){
            int n = nums[i];
            int tmp = curMax * n;
            curMax = Math.max(Math.max(tmp, n * curMin),n);
            curMin = Math.min(Math.min(tmp, n * curMin),n);
            res = Math.max(res, curMax);
        }
        return res;
    }
}