class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int zeros = 0;
        for (int i = 0; i < len; i++) {
            if(i > 0 && i < len - zeros && nums[i-1] == 0) i--;
            if (nums[i] == 0) {
                zeros++;
                for (int j = i; j < len - 1; j++) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}