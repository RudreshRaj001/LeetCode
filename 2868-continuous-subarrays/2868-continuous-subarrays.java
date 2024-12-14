class Solution {
    public long continuousSubarrays(int[] nums) {
        long ans = 0;
        int l = 0; // Left pointer of the sliding window
        int r = 0; // Right pointer of the sliding window
        int min = nums[0];
        int max = nums[0];
        
        while (r < nums.length) {
            // Update the window's min and max
            min = Math.min(min, nums[r]);
            max = Math.max(max, nums[r]);

            // If the difference exceeds 2, shrink the window
            while (max - min > 2) {
                l++; // Move the left pointer
                min = nums[l];
                max = nums[l];
                for (int k = l; k <= r; k++) {
                    min = Math.min(min, nums[k]);
                    max = Math.max(max, nums[k]);
                }
            }

            // Add all subarrays ending at `r` and starting from [l..r]
            ans += (r - l + 1);
            r++;
        }
        return ans;
    }
}
