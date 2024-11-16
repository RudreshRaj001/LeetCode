class Solution {
    public boolean primeSubOperation(int[] nums) {
        int n = nums.length;
        int max = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }

        boolean[] sieve = new boolean[max + 1];
        fill(sieve, true);
        sieve[1] = false;
        for(int i = 2; i <= Math.sqrt(max + 1); i++){
            if(sieve[i]){
                for(int j = i * i; j <= max; j += i){
                    sieve[j] = false;
                }
            }
        }

        int currValue = 1;
        int i = 0;
        while(i < nums.length){
            int diff = nums[i] - currValue;
            // 4 9 6 5
            if (diff < 0) {
                return false;
            }

            if (sieve[diff] == true || diff == 0) {
                i++;
                currValue++;
            } else {
                currValue++;
            }

        }
        return true;
    }
    private void fill(boolean[] arr, boolean value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
    }
}