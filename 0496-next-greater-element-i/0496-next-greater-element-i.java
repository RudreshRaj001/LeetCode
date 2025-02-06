class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int greater = -1;
        for(int i = 0; i < nums2.length - 1; i++){
            boolean flag = true;
            for(int j = i + 1; j < nums2.length; j++){
                if(nums2[i] < nums2[j]){
                    map.put(nums2[i], nums2[j]);
                    flag = false;
                    break;
                }
            }
            if(flag){
                map.put(nums2[i], -1);
            }
        }
        map.put(nums2[nums2.length - 1], -1);

        int[] ans = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            int get = map.get(nums1[i]);
            if(get > nums1[i]){
                ans[i] = get;
            }else{
                ans[i] = -1;
            }
        }
        return ans;
    }
}