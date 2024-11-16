class Solution {
    public int[] resultsArray(int[] nums, int k) {
        if(k == 1) return nums;
        int n = nums.length;
        int[] ans = new int[n - k + 1]; 
        
        // for (int i = 0; i <= n - k; i++) {
            // boolean isConsecutive = true;
            // int maxElement = nums[i];

            // for (int j = i; j < i + k - 1; j++) {
            //     if (nums[j] + 1 != nums[j + 1]) {
            //         isConsecutive = false;
            //         break;
            //     }
            //     maxElement = Math.max(maxElement, nums[j + 1]);
            // }
            
            // if (isConsecutive) {
            //     ans[i] = maxElement;
            // } else {
            //     ans[i] = -1;
            // }
        // }
        int count = 1;
        int j = 0;
        for(int i = 1; i < n; i++){
            if(nums[i - 1] + 1 == nums[i]){
                count++;
            }else{
                count = 1;
            }
            
            if(i >= k - 1){
                if(count >= k){
                    ans[j] = nums[i];
                }else{
                    ans[j] = -1;
                }
                j++;
            }
        }
        
        return ans;
    }
}
