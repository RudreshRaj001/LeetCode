class Solution {
    public long minEnd(int n, int x) {
        long first = x;
        while(n > 1){
            first++;
            first = x | first;
            n--;
        }
        return first;
    }
}