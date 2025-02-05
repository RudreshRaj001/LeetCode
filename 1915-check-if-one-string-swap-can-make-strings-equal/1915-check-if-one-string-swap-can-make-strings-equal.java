class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int cnt = 2;
        int[] indexes = new int[2];
        int j = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                cnt--;
                if (cnt < 0) {
                    return false;
                }
                indexes[j] = i;
                j++;
            }
        }
        int a = indexes[0];
        int b = indexes[1];
        return s1.charAt(a) == s2.charAt(b) && s1.charAt(b) == s2.charAt(a);
    }
}