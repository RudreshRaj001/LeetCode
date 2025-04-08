class Solution {
    public int minimumOperations(int[] nums) {
        int j = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = nums.length - 1; i >= 0; i--){
            if(set.contains(nums[i])){
                j = i + 1; 
                break;
            }
            set.add(nums[i]);
        }

        return (int)Math.ceil(j / 3.0);
    }
}