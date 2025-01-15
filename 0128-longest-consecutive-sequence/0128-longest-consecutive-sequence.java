class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        int ans = 0;

        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
                int num = nums[i] + 1;
                int max = 1;
                while(set.contains(num)){
                    set.remove(num);
                    max++;
                    num++;
                }
                num = nums[i] - 1;
                while(set.contains(num)){
                    set.remove(num);
                    max++;
                    num--;
                }
                ans = Math.max(ans, max);
            }
        }
        return ans;
    }
}