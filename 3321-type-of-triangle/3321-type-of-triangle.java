class Solution {
    public String triangleType(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < 3; i++){
            set.add(nums[i]);
        }
        if(nums[0] + nums[1] <= nums[2] || nums[1] + nums[2] <= nums[0] || nums[2] + nums[0] <= nums[1]){
            return new String("none");
        }
        if(set.size() == 1) return new String("equilateral");
        if(set.size() == 2) return new String("isosceles");
        if(set.size() == 3) return new String("scalene");
        return new String("none");
    }
}