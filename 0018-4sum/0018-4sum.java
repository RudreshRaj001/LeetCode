class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> listOfLists = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                for (int k = j + 1; k < n - 1; k++) {
                    if (k > j + 1 && nums[k] == nums[k - 1]) {
                        continue;
                    }
                    for (int l = k + 1; l < n; l++) {
                        if (l > k + 1 && nums[l] == nums[l - 1]) {
                            continue;
                        }
                        long total = (long) nums[i] + (long) nums[j] + (long) nums[k] + (long) nums[l];
                        if (total == (long) target) {
                            List<Integer> List = new ArrayList<>();
                            List.add(nums[i]);
                            List.add(nums[j]);
                            List.add(nums[k]);
                            List.add(nums[l]);
                            listOfLists.add(List);
                        }
                    }
                }
            }
        }
        return listOfLists;
    }
}