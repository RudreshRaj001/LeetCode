class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 1;
        int candidate = nums[0];
        for(int i = 1; i < n; i++){
            if(nums[i] == candidate){
                count++;
            }else{
                count--;
            }
            if(count == 0){
               candidate = nums[i];
               count = 1; 
            } 
        }
        return candidate;
    }
}