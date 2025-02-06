class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = 0;
        int ans = 0;
        while(i < nums.length && j < nums.length){
            int min = nums[i];
            while(j < nums.length && nums[j] - min <= 1){
                j++;
            }
            if(j > 0 && nums[j - 1] - min == 1){
                ans = Math.max(ans, j - i);
            }
            i++;
        }
        return ans;
    }
}