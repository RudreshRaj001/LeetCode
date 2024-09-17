class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 2 3 4 5 6 7 8 9    -> 17
        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[i]; //2  
            //  3 4 5 6 7 8 9 
            for (int j = i+1; j < nums.length; j++) {
                int num2 = nums[j];
                if (num1 + num2 == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] { -1, -1 };
    }
}