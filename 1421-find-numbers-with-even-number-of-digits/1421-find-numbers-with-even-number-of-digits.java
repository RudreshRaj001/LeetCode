class Solution {
    public int findNumbers(int[] nums) {
        int count = nums.length;
        for(int num : nums){
            count -= (int)(Math.log10(num) + 1) % 2;
        }
        return count;
	}
}
