class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];
        if (k == 0)
            return res;

        int l = 0;
        int sum = 0;

        for (int i = 0; i < n + Math.abs(k); i++) {
            sum += code[i % n];
            int win = i - l + 1;
            if (i - l + 1 > Math.abs(k)) {
                sum -= code[l % n];
                l = (l + 1) % n;
            }

            if (i - l + 1 == Math.abs(k)) {
                if (k > 0) {
                    res[(l - 1 + n) % n] = sum;
                } else {
                    res[(i + 1) % n] = sum;
                }
            }
        }

        return res;
    }
}