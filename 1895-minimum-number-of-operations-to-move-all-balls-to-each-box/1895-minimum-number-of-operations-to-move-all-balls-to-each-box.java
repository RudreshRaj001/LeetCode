class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();

        int[] lr = new int[n];
        int[] rl = new int[n];

        int balls = boxes.charAt(0) - '0';
        for (int i = 1; i < n; i++) {
            lr[i] = lr[i - 1] + balls;
            if (boxes.charAt(i) == '1')
                balls++;
        }

        balls = boxes.charAt(n - 1) - '0';
        for (int i = n - 2; i >= 0; i--) {
            rl[i] = rl[i + 1] + balls;
            if (boxes.charAt(i) == '1')
                balls++;
        }

        for (int i = 0; i < n; i++) {
            lr[i] = lr[i] + rl[i];
        }

        return lr;
    }
}