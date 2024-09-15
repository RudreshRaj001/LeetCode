class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int len = nums.length;
        int[] count = new int[len];
        int[] ans = new int[2];
        int j = 0;
        for(int i = 0; i < len; i++){
            count[nums[i]]++;
            if(count[nums[i]] > 1){
                ans[j] = nums[i];
                j++;
            }
            if(j > 1){
                return ans;
            }

        }
        return ans;
    }
}