class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int right = numbers.length - 1;
        int left = 0;

        while(left < right){
            int total = numbers[left] + numbers[right];
            if(total == target){
                return new int[]{left + 1, right + 1};
            }else if(total > target){
                right--; // this decreases the value of total
            }else{
                left++; // this Increases the value of total
            }
        }

        return new int[]{-1, -1};
    }
}