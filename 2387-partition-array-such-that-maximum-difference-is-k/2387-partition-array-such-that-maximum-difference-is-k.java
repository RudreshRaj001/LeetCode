class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int num = nums[0];
        int cnt = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] - num > k){
                num = nums[i];
                cnt++;
            } 
        }
        return cnt;
    }
}