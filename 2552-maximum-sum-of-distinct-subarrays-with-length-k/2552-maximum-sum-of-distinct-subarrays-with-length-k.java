class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long max = 0;
        long sum = 0;
        int l = 0;
        int dups = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            sum += nums[i];
            if(map.containsKey(nums[i])){
                int val = map.get(nums[i]);
                map.put(nums[i], val+1);
                dups++;
            }else{
                map.put(nums[i], 1);
            }

            if (i - l + 1 > k) {
                sum -= nums[l];
                int val = map.get(nums[l]);
                if(val > 1){
                    map.put(nums[l], val-1);
                    dups--;
                }else{
                    map.remove(nums[l]);
                }
                l++;
            }

            if (i - l + 1 == k && dups == 0) {
                if(max < sum){
                    max = sum;
                }
            }
        }
        return max;
    }
}