import java.util.Arrays;

class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        long total = 0; 
        int left = 0; 
        int maxFrequency = 0;

        for (int right = 0; right < n; right++) {
            total += nums[right];

            while ((long) nums[right] * (right - left + 1) > total + k) {
                total -= nums[left];
                left++;
            }

            maxFrequency = Math.max(maxFrequency, right - left + 1);
        }

        return maxFrequency;
    }
}
