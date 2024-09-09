class Solution {
    public double myPow(double x, int n) {
        double base = x;
        long power = (long) n;

        if (n < 0) {
            base = 1 / x;
            power = -power;
        }

        double ans = 1;

        while (power > 0) {
            if ((power & 1) == 1) {
                ans *= base;
            }

            base *= base;
            power = power >> 1;
        }
        return ans;
    }
}