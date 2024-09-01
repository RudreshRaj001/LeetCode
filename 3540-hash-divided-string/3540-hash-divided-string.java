class Solution {
    public String stringHash(String s, int k) {
        StringBuilder ans = new StringBuilder();
        int len = s.length();
        int pos = 0;

        while (pos < len) {
            int alphabet = 0;
            int times = k;

            // Process up to 'k' characters or until the end of the string
            while (times > 0 && pos < len) {
                alphabet += (int)s.charAt(pos) % 97;  // Assuming only lowercase letters
                pos++;
                times--;
            }

            // Convert the accumulated value to a character within 'a' to 'z' range
            ans.append((char)('a' + alphabet % 26));
        }

        return ans.toString();
    }
}
