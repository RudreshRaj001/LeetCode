class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int l = nums.length;
        int[] array = new int[l];
        for(int i = 0; i < l; i++){
            array[i] = 0;
        }
        for(int i = 0; i < l; i++){
            for(int j = 0; j < l; j++){
                if(nums[i] > nums[j]){
                    array[i]++;
                }
            }
        }
        return array;
    }
}