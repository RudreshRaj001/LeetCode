class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        // HashSet<Integer> hashSet = new HashSet<>();
        // for (int num : banned) {
        //     hashSet.add(num); 
        // }
        boolean[] isBanned = new boolean[10001];
        for (int ban : banned) {
            isBanned[ban] = true;
        }
        int count = 0;
        int sum = 0;
        for(int i = 1; i <= n; i++){
            // if(hashSet.contains(i)) continue;
            // if(sum + i <= maxSum){
            //     sum += i;
            //     count++;
            // }
            if (sum + i > maxSum) {
                break;
            }
            if (!isBanned[i]) {
                sum += i;
                count++;
            }
        }
        return count;
    }
}