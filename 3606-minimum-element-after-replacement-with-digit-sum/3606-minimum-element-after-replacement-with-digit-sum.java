class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        int len = nums.length;
        for(int i = 0; i < len; i++){
            int num = nums[i];
            int sum = 0;
            while(num > 0){
                sum += num%10;
                num /= 10;
            }
            if(sum < min){
                min = sum;
            }
        } 
        return min;
    }
}