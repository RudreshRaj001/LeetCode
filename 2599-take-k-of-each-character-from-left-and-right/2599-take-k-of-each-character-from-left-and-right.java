class Solution {
    public int takeCharacters(String s, int k) {
        int[] count = new int[3];
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            count[ch - 'a']++;
        }
        if (minm(count) < k) {
            return -1;
        }

        int res = Integer.MAX_VALUE;
        int l = 0;
        for (int r = 0; r < len; r++) {
            count[s.charAt(r) - 'a']--;
            while (minm(count) < k) {
                count[s.charAt(l) - 'a']++;
                l++;
            }
            res = Math.min(res, len - (r - l + 1));
        }
        return res;
    }

    private int minm(int[] count) {
        return Math.min(Math.min(count[0], count[1]), count[2]);
    }

}