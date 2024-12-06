class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : banned) {
            hashSet.add(num); 
        }
        int count = 0;
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(hashSet.contains(i)) continue;
            if(sum + i <= maxSum){
                sum += i;
                count++;
            }
        }
        return count;
    }
}