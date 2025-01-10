class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> result = new ArrayList<>();
        
        
        int[] h = new int[26];
        for(String s: words2){
            int[] hash = new int[26];
            for(char ch: s.toCharArray()){
                hash[ch - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                h[i] = Math.max(h[i], hash[i]);
            }
        }

        for(String s: words1){
            int[] hash = new int[26];
            for(char ch: s.toCharArray()){
                hash[ch - 'a']++;
            }

            if(subset(hash, h)) result.add(s);
        }
        return result;
    }
    private boolean subset(int[] hash, int[] h) {
        for (int i = 0; i < 26; i++) {
            if (h[i] > hash[i]) { 
                return false;
            }
        }
        return true; 
    }
}