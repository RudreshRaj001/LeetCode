class Solution {
    public int jump(int[] nums) {
        int steps = 0;
        int l = 0;
        int r = 0;
        while(r < nums.length - 1){
            int farthest = 0;
            for(int i = l; i <= r; i++){
                if(farthest < i + nums[i]){
                    farthest = i + nums[i];
                }
            }
            l = r + 1;
            r = farthest;
            steps++;
        }
        return steps;
    }
}