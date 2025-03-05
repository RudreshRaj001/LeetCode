class Solution {
    public long coloredCells(int n) {
        return 1l + 4l *((long)(n - 1) * (long)n / 2l);
    }
}