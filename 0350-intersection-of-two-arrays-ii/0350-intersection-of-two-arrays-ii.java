class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Create an array to count occurrences
        int[] countArray = new int[1001];
        ArrayList<Integer> resList = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;
        
        for(int i = 0; i < n; i++){
                countArray[nums1[i]]++;
            // if(countArray[nums1[i]] == 2){
            //     resList.add(nums1[i]);
            // }
        }
        for(int i = 0; i < m; i++){
            if(countArray[nums2[i]] >= 1){
                resList.add(nums2[i]);
                countArray[nums2[i]]--;
            } 
            // if(countArray[nums2[i]] == 2){
            //     resList.add(nums2[i]);
            // }
        }

        // Convert the ArrayList to an array for the return value
        int[] res = new int[resList.size()];
        for(int i = 0; i < resList.size(); i++){
            res[i] = resList.get(i);
        }

        return res;
    }
}