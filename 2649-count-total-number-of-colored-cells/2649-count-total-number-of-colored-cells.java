class Solution {
    public long coloredCells(int n) {
        return 1 + 4 *((long)(n - 1) * (long)n / 2);
    }
}