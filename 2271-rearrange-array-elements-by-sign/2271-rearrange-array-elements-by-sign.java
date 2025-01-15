class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i = 0;
        int j = 0;
        int k = 0;

        int n = nums.length;
        int[] ans = new int[n];
        while(i < n && j < n){
            while(i < n && nums[i] < 0){
                i++;
            }
            ans[k] = nums[i];
            k++;
            while(j < n && nums[j] > 0){
                j++;
            }
            ans[k] = nums[j];
            k++;

            i++;
            j++;
        }
        return ans;
    }
}