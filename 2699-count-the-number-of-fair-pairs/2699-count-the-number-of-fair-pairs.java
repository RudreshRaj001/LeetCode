class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        int n = nums.length;
        long cnt = 0;
        Arrays.sort(nums);
        for(int i = 0; i < n; i++){
            long low = lower - nums[i];
            long up = upper - nums[i];

            cnt += (long)(search(i + 1, n - 1, up + 1, nums) - search(i + 1, n - 1, low, nums));
        }
        
        return cnt;
    }
    public long search(long l, long r, long target, int[] nums){
        while(l <= r){
            long m =  l + (r - l) / 2;
            if(nums[(int)m] >= target){
                r = m - 1;
            }else{
                l = m + 1;
            }
        }
        return r;
    }
}