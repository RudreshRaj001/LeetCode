class Solution {
    public boolean isGoodArray(int[] nums) {
        int tempGCD = nums[0];
        for (int i = 0; i < nums.length; i++) {
            tempGCD = hcf(tempGCD, nums[i]);
            if (tempGCD == 1) {
                return true;
            }
        }
        return false;
    }

    static int hcf(int a, int b) {
        if (b == 0) {
            return a;
        }
        return hcf(b, a % b);
    }
}