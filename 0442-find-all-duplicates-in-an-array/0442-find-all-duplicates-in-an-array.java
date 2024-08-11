class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        int[] count = new int[n + 1];
        List<Integer> List = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            count[nums[i]]++;
            if (count[nums[i]] > 1) {
                List.add(nums[i]);
            }
        }
        return List;
    }
}