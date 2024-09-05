class Solution {
    public int singleNumber(int[] nums) {
        int unique = 0;
        for (int n : nums) {
            int prev = unique;
            unique ^= n;
        }
        return unique;
    }
}