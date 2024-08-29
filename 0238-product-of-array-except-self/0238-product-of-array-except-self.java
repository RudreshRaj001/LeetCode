class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int product = 1;
        int hasZero = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
               product *= nums[i];
            }else{
                hasZero++;
            }

            if (hasZero > 1) {
                return new int[n];
            }
        }
        for(int i = 0; i < n; i++){
            if(hasZero > 0){
                if(nums[i] != 0){
                    nums[i] = 0;
                }else{
                    nums[i] = product;
                }
            }else{
                nums[i] = product/nums[i];
            } 
        }
        return nums;
    }
}