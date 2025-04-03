class Solution {
    public long maximumTripletValue(int[] nums) {
        int preMax = nums[0];
        int maxDiff = 0;
        long res = 0;
        for(int i = 1; i < nums.length; i++){
            res = Math.max(res,(long) maxDiff * nums[i]);
            maxDiff = Math.max(maxDiff, preMax - nums[i]);
            preMax = Math.max(preMax, nums[i]);
        }
        return res;
    }
}