class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans = 0;
        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    ans = Math.max(ans, (long)(nums[i] - nums[j]) * (long)nums[k]);
                }
            }
        }
        return ans < 0 ? 0 : ans;
    }
}