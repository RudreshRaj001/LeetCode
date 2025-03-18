class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = -1;
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            max = Math.max(max, map.get(nums[i]));
        }
        // int num = -1;
        // int max = -1;
        // for(int key : map.keySet()){
        //     if(max < map.get(key)){
        //         num = key;
        //         max = map.get(key);
        //     }
        // }
        // int first = -1;
        // int last = -1;
        int ans = nums.length;
        for(int i = 0; i < nums.length; i++){
            if(max == map.get(nums[i])){
                ans = Math.min(ans, fs(nums, nums[i]));
            }
        }
        return ans;
    }
    private int fs(int[] nums, int target){
        int first = -1;
        int last = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                if(first == -1) first = i;
                last = i;
            }
        }
        return last - first + 1;
    }
}