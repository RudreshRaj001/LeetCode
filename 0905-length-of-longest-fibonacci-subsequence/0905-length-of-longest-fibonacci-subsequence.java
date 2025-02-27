class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int n = arr.length;
        for(int x : arr){
            set.add(x);
        }
        int ans = 0;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                int prev = arr[i];
                int cur = arr[j];
                int next = prev + cur;

                int cnt = 2;
                while(set.contains(next)){
                    cnt++;
                    prev = cur;
                    cur = next;
                    next = prev+cur;
                    ans = Math.max(ans, cnt);
                }
            }
        }
        return ans;
    }
}