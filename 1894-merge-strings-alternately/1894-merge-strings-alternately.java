class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int w1 = word1.length();
        int w2 = word2.length();
        int length = w1 > w2 ? w1 : w2;
        for(int i = 0; i < length; i++){
            if(i < w1){
                result.append(word1.charAt(i));
            }
            if(i < w2){
                result.append(word2.charAt(i));
            }
        }
        return result.toString();
    }
}