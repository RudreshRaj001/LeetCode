class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int res = 0;
         boolean fl1 = nums1.length % 2 != 0;
         boolean fl2 = nums2.length % 2 != 0;
         if(fl1){
            for(int i = 0; i < nums2.length; i++){
                res ^= nums2[i];
            }
         }
         if(fl2){
            for(int i = 0; i < nums1.length; i++){
                res ^= nums1[i];
            }
         }
         return res;
    }
}