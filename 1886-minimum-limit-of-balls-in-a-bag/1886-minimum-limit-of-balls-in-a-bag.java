class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int n = nums.length;
        int low = 1;
        int high = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            high = Math.max(nums[i], high);
        }
        int res = high;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(canDivide(nums, mid, maxOperations)){
                high = mid;
                res = high;
            }else{
                low = mid + 1;
            }
        }
        return res;
    }
    private boolean canDivide(int[] nums, int maxBalls, int maxOperations){
        int ops = 0;
        for(int n : nums){
            if(n > maxBalls){
                ops += (int)Math.ceil((double)(n - maxBalls)/maxBalls);
            }
            if(ops > maxOperations) return false;
        }
        return ops <= maxOperations;
    }
}