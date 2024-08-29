class Solution {
    public int reachNumber(int target) {
        // if(target < 0) target *= -1;
        target = Math.abs(target);
        int n = 1;
        int sum = 0;

        while(sum < target){
            sum += n;
            n++;
        }
        if((sum - target) % 2 == 0){
            return n - 1;
        }else{
            while((sum - target) % 2 != 0){
                sum += n;
                n++;
            }
            return n - 1;
        }
    }
}