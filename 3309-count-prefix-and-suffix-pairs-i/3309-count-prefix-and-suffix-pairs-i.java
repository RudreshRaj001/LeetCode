class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int cnt = 0;
        for (int i = 0; i < words.length; i++) {
            String a = words[i];
            for (int j = i + 1; j < words.length; j++) {
                String b = words[j];
                if(b.startsWith(a) && b.endsWith(a)) cnt++;
            }
        }
        return cnt;
    }
}