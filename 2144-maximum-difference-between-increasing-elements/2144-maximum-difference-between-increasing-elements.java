class Solution {
    public int maximumDifference(int[] nums) {
        int i = 0;
        int max = Integer.MIN_VALUE;
        for(int j = 1; j < nums.length; j++){
            if(nums[i] < nums[j]){
                max = Math.max(nums[j] - nums[i], max);
            }else{
                i = j;
            }
        }
        return max <= 0 ? -1 : max;
    }
}