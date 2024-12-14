class Solution {
    public long continuousSubarrays(int[] nums) {
        long ans = 0;
        int l = 0; 
        int r = 0; 
        int min = nums[0];
        int max = nums[0];
        
        while (r < nums.length) {
            min = Math.min(min, nums[r]);
            max = Math.max(max, nums[r]);

            while (max - min > 2) {
                l++;
                min = nums[l];
                max = nums[l];
                for (int k = l; k <= r; k++) {
                    min = Math.min(min, nums[k]);
                    max = Math.max(max, nums[k]);
                }
            }

            ans += (r - l + 1);
            r++;
        }
        return ans;
    }
}
