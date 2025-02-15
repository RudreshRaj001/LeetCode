class Solution {
    public int punishmentNumber(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++){
            int sqr = i * i;
            if(isPartitioned(String.valueOf(sqr), 0, 0, i)){
                sum += sqr;
            }
        }
        return sum;
    }
    // private boolean canPartition(String num, int target){
        
    // }
    public boolean isPartitioned(String i,int idx,int curSum,int target){
        int n = i.length();
        if(idx==n){
            return (curSum==target);
        }
        for(int j=idx;j<n;j++){
            int val = Integer.parseInt(i.substring(idx,j+1));
            if(isPartitioned(i,j+1,curSum+val,target)){
                return true;
            }
        }
        return false;
    }
}