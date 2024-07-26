class Solution {
    public int findNumbers(int[] nums) {
        int count = nums.length;
        for(int num : nums){
            count -= (int)(Math.log10(num) + 1) % 2;
        }
        return count;
        // Math.log10(num) -> number of 10 power which equals nums
        // eg: num = 100 --> 10^2 == 100
        // eg: num = 1246 --> 10^3.09 == 1246
        // doing (int)(Math.log10(num) + 1) will give no of digits
        // (int)(Math.log10(num) + 1) % 2 --> gives 0 when even and 1 when odd

        // means we subtract 1 everytime a odd no. appears form the count which contains length of the nums array times numbers
        // at the we'll be left with the no. of even no. digits numbers
	}
}