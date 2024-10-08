class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Integer.MIN_VALUE;
        for(int p : piles){
            high = Math.max(p, high);
        }

        while(low <= high){
            int mid = (low+high)/2;
            if(isBananaPossible(piles, mid, h) == true){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
    boolean isBananaPossible(int[] piles, int k, int h){
        int total = 0;
        for(int p : piles){
            total += Math.ceil((double) p / k);
        }

        if(total <= h){
            return true;
        }
        return false;
    }
}