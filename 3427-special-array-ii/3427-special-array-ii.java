class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] arr = new int[n];
        int parity = nums[0] % 2;
        nums[0] = 1;
        int len = 1;
        for(int i = 1; i < n; i++){
            if(nums[i] % 2 != parity){
                parity = nums[i] % 2;
                arr[i] = ++len;
            }else{
                parity = nums[i] % 2;
                len = 1;
                arr[i] = len;
            }
        }
        boolean[] parities = new boolean[queries.length];
        for(int i = 0; i < queries.length; i++){
            if(queries[i][1] == queries[i][0]){
                parities[i] = true;
                continue;
            }
            int range = queries[i][1] - queries[i][0] + 1;
            if(range > arr[queries[i][1]]){
                parities[i] = false;
            }else{
                parities[i] = true;
            }
        }
        return parities;
    }
}