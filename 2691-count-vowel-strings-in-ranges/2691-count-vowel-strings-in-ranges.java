class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int n = queries.length;
        boolean[] isVowel = new boolean[words.length];
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (vowels.contains(word.charAt(0)) && vowels.contains(word.charAt(word.length() - 1))) {
                isVowel[i] = true;
            } else {
                isVowel[i] = false;
            }
        }
        int[] count = new int[words.length];
        int cnt = 0;
        for (int i = 0; i < words.length; i++) {
            if (isVowel[i]) cnt++;
            count[i] = cnt;
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            ans[i] = count[e] - (s - 1 >= 0 ? count[s - 1] : 0);
        }
        return ans;
    }
}