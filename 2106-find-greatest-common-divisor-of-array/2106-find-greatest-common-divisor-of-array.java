class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int n : nums){
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        return hcf(max, min);
    }
     static int hcf(int a, int b) {
        if (b == 0) {
            return a;
        }
        return hcf(b, a % b);
    }
}