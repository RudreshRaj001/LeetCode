class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length == 1) return 1;
        int maxInc = 0;
        int maxDec = 0;
        int cntI = 1;
        int cntD = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                cntI++;
                cntD = 1;
            } else if (nums[i - 1] > nums[i]) {
                cntD++;
                cntI = 1;
            } else {
                cntD = 1;
                cntI = 1;
            }
            maxDec = Math.max(cntD, maxDec);
            maxInc = Math.max(cntI, maxInc);
        }
        return Math.max(maxInc, maxDec);
    }
}