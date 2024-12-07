class Solution {
    public int minOperations(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > k && !set.contains(nums[i])){
                set.add(nums[i]);
                count++;
            } else if(nums[i] < k) {
                return -1;
            }
        }
        return count;
    }
}