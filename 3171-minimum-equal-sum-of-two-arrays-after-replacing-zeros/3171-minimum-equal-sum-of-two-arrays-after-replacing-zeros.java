class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long cnt1 = 0;
        long cnt2 = 0;
        long sum1 = 0;
        long sum2 = 0;

        boolean z1 = false;
        boolean z2 = false;
        for(int i = 0; i < nums1.length; i++){
            if(nums1[i] == 0){
                z1 = true;
                cnt1++;
            } 
            sum1+=nums1[i];
        }

        for(int i = 0; i < nums2.length; i++){
            if(nums2[i] == 0){
                z2 = true;
                cnt2++;
            } 
            sum2+=nums2[i];
        }

        if(!(z1 && z2)){
            if((!z1 && !z2) && sum1 == sum2){
                return sum1;
            }
            if(z1 && sum1 < sum2){
                if(cnt1 > (sum2 - sum1)){
                    return -1;
                }
                return sum2;
            }
            if(z2 && sum2 < sum1){
                if(cnt2 > (sum1 - sum2)){
                    return -1;
                }
                return sum1;
            }

            return -1;
        }
        if(sum1 == sum2){
            return cnt1 > cnt2 ? sum1 + cnt1 : sum2 + cnt2;
        }
        return sum1 + cnt1 > sum2 + cnt2 ? sum1 + cnt1 : sum2 + cnt2;
    }
}