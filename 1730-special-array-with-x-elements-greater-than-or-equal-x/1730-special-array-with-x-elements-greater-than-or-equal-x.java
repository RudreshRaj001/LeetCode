class Solution {
    public int specialArray(int[] nums) {
        // // Arrays.sort(nums);
        // int target = 1;
        // int potentialAns = -1;
        // // int backindex = nums.length - 1;
        // for(int i = nums.length - 1; i >= 0; i--){
        //     if(nums[i] >= target){
        //         potentialAns = target;
        //         target++;
        //     }
        //     if(nums[i] == potentialAns){
        //         target = 1;
        //         potentialAns = -1;
        //     }
        //     // if((nums[i] == potentialAns && (i - 1 < 0)) || target < (backindex - i)){
        //     //     backindex = backindex - i;
        //     //     target = 1;
        //     //     potentialAns = -1;
        //     // }
        // }
        // return potentialAns;


        // NOTE TO SELF: WRITE DOWN THEN UNDERSTAND

        Arrays.sort(nums);
        int n = nums.length;
        
        if (nums[0] >= n) return n;
        
        for (int i = 1; i <= n; i++) {
            if (nums[n - i] >= i && (n - i - 1 < 0 || nums[n - i - 1] < i)) {
                return i;
            }
        }
        
        return -1;

        // 0 3 6 7 7

    //     Arrays.sort(nums);
    //     int count = 0;
    //     int x = 0;
    //     for(int i = nums.length - 1; i >= 0; i--){
    //         if(nums[i] >= x && nums[i] != 0){  
    //             count++;
    //             x++;
    //         }
    //         if(nums[i] < x){
    //                 return -1;
    //          }
            
            
    //     }
    //     if(count == 0){
    //         return -1;
    //     }
    //     return count;
    }
}