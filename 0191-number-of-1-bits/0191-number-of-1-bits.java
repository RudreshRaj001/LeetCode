class Solution {
    public int hammingWeight(int n) {
        int cnt = 0;
        while(n > 0){
          n = n - (n & -n);
          cnt++;
        }
        return cnt;
    }
}