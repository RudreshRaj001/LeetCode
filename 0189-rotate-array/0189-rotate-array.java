class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int[] ans = new int[length];
        for(int i = 0; i < length; i++){
            int index = (i + k)%length;
            ans[index] = nums[i];
        }
        for(int i = 0; i < length; i++){
            nums[i] = ans[i];
        }
    }
}