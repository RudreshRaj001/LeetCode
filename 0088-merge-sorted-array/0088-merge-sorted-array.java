class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // if(n == 0) return;
        // int j = 0;
        // int i = 0;
        // while(i < m){
        //     if(j>n){
        //         return;
        //     }
        //     if(nums1[i] > nums2[j]){
        //         int temp = nums1[i];
        //         nums1[i] = nums2[j];
        //         nums2[j] = temp;
        //         int z = j;
        //         while(z < n && nums2[z] > nums2[z+1]){
        //           int temp2 = nums2[z];
        //           nums2[z] = nums2[z+1];
        //           nums2[z+1] = temp2;
        //           z++;
        //         }
        //         j--;
        //     }
        //     j++;
        //     i++;
        // }
        // while(j<n){
        //     nums1[i] = nums2[j];
        //     j++;
        //     i++;
        // }

        int p1 = m - 1;
        int p2 = n - 1;
        int pMerge = m + n - 1;
        
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[pMerge--] = nums1[p1--];
            } else {
                nums1[pMerge--] = nums2[p2--];
            }
        }

    }
}