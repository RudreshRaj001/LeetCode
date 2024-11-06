class Solution {
    public boolean canSortArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {

                if (nums[j] > nums[j + 1]) {
                    int bitcnt1 = Integer.bitCount(nums[j]);
                    int bitcnt2 = Integer.bitCount(nums[j + 1]);
                    if (bitcnt1 != bitcnt2)
                        return false;
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return true;
    }
}