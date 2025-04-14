class Solution {

    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        List<Integer> List = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] *= -1;
            } else {
                List.add(index + 1);
            }
        }
        return List;
    }
}