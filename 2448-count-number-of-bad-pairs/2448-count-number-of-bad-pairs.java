class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long total_pairs = 0;
        long good_pairs = 0;
        for(int i = 0; i < nums.length; i++){
            total_pairs += i;
            int num = nums[i] - i;
            good_pairs += map.getOrDefault(num, 0);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return total_pairs - good_pairs;
    }
}