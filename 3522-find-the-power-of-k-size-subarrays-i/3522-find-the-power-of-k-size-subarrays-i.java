class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1]; 
        
        for (int i = 0; i <= n - k; i++) {
            boolean isConsecutive = true;
            int maxElement = nums[i];

            for (int j = i; j < i + k - 1; j++) {
                if (nums[j] + 1 != nums[j + 1]) {
                    isConsecutive = false;
                    break;
                }
                maxElement = Math.max(maxElement, nums[j + 1]);
            }
            
            if (isConsecutive) {
                ans[i] = maxElement;
            } else {
                ans[i] = -1;
            }
        }
        
        return ans;
    }
}
