class Solution {
    public int largestCombination(int[] arr) {
        int max = 0;
        for (int i = 0; i < 32; i++) {
            int freq = 0;
            for (int ele : arr) {
                if ((ele & (1 << i)) != 0) {
                    freq++;
                }
            }
            max = Math.max(max, freq);
        }
        return max;
    }
}