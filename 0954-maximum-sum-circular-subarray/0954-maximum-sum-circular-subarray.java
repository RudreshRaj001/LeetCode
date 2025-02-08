class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0];
        int minSum = nums[0];
        int totalSum = 0;
        int sum = 0;
        int minsum = 0;
        int j = 0;
        int k = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            if(maxSum < sum){
                maxSum = sum;
            }
            if(sum < 0){
                sum = 0;
            } 

            // min sum
            minsum += nums[i];
            if(minSum > minsum){
                minSum = minsum;
            }
            if(minsum > 0){
                minsum = 0;
            } 
            totalSum += nums[i];
        }

        if(maxSum>0){
            return Math.max(maxSum, totalSum-minSum);
        }
        return maxSum;
    }
}