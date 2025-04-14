class Solution {

    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        List<Integer> List = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] *= -1;
            } else {
                List.add(Math.abs(nums[i]));
            }
        }
        return List;
    }
}