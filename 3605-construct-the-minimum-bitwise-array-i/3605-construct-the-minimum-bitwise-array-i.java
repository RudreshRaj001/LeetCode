class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = -1;
            int temp = nums.get(i);
            while(temp > 0){
                if((temp | temp - 1) == nums.get(i)) ans[i] = temp - 1;
                temp--;
            }
        }
        return ans;
    }
}