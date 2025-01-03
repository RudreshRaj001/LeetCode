class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long sumRight = 0;
        for(int i = 0; i < n; i++){
            sumRight += nums[i];
        }
        long sumLeft = 0;
        int cnt = 0;
        for(int i = 0; i < n - 1; i++){
            sumLeft += nums[i];
            sumRight -= nums[i];
            if(sumLeft >= sumRight) cnt++;
        }
        return cnt;
    }
}