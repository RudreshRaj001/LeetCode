class Solution {
    public int subsetXORSum(int[] nums) {
        return helper(nums, 0, 0);
    }
    private int helper(int[] nums, int ind, int xor){
        if(ind == nums.length){
            return xor;
        }

        int pick =  helper(nums, ind + 1, xor ^ nums[ind]);
        int nopick = helper(nums, ind + 1, xor);
        return pick + nopick;
    }
}