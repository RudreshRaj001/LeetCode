class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        int w1 = word1.length();
        int w2 = word2.length();
        while(i < w1 || i < w2){
            if(i < w1){
                result.append(word1.charAt(i));
            }
            if(i < w2){
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }
}