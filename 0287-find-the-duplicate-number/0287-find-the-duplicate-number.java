class Solution {
    public int findDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] > 0){
                nums[index] *= -1;
            }else{
                return index + 1;
            }
        }
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] > 0){
        //         return i + 1;
        //     }
        // }
        return -1;
    }
}