class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int orMask = 0;
        int i = 0;
        int ans = 0;
        for(int j = 0; j < n; j++){
            while((orMask & nums[j]) != 0){
                orMask ^= nums[i];
                i++;
            }

            orMask |= nums[j];
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }
}