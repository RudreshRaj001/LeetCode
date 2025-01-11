class Solution {
    public boolean canConstruct(String s, int k) {
        int n = s.length();
        if(n < k) return false;
        if(n == k) return true;
        int odd = 0;
        int[] count = new int[26];
        for(int i = 0; i < n; i++){
            count[s.charAt(i) - 'a'] ^= 1;
            odd += count[s.charAt(i) - 'a'] == 0 ? -1 : 1;
        }
        return odd <= k;
    }
}