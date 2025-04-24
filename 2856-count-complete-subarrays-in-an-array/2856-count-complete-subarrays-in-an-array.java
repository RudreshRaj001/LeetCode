class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int distinct = set.size();

        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            HashSet<Integer> currentSet = new HashSet<>();
            for (int j = i; j < n; j++) {
                currentSet.add(nums[j]);
                if (currentSet.size() == distinct) {
                    count++;
                }
            }
        }
        return count;
    }
}