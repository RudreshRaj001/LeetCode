class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // List<List<Integer>> listOfLists = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        int closest = Integer. MAX_VALUE;
        // int ans = best;

        for (int i = 0; i < len; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = len - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                // int current = Math.abs(target - sum);
                // // if(current != 0) current *= -1;
                if(Math.abs(target - sum) < Math.abs(target - closest)){
                    closest = sum;
                }
                if (sum > target) {
                    k--;
                } else {
                    // // best = total;
                    // best = current;
                    // ans = sum; // potential ans
                    j++;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                }
            }
        }
        return closest;
    }
}