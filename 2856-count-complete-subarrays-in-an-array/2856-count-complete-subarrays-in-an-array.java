class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int totalDistinct = set.size();

        int n = nums.length;
        int count = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();
        int left = 0;
 
         for (int right = 0; right < n; right++) {
            freqMap.put(nums[right], freqMap.getOrDefault(nums[right], 0) + 1);
            while (freqMap.size() == totalDistinct) {
                count += (n - right);
                freqMap.put(nums[left], freqMap.get(nums[left]) - 1);
                if (freqMap.get(nums[left]) == 0) {
                    freqMap.remove(nums[left]);
                }
                left++;
            }

         }
        return count;
    }
}