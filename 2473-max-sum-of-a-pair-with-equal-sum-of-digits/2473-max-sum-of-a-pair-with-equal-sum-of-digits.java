class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = -1;
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int sum = 0;
            while(num > 0){
                sum += num % 10;
                num /= 10;
            }
            if(map.containsKey(sum)){
                int a = map.get(sum);
                ans = Math.max(nums[i] + a, ans);
                map.put(sum, Math.max(a, nums[i]));
            }else{
                map.put(sum, nums[i]);
            }
        }
        return ans;
    }
}