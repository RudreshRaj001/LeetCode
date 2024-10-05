class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] ch = new boolean[26];
        for(int i = 0; i < sentence.length(); i++){
            ch[sentence.charAt(i) - 97] = true;
        }
        for(int j = 0; j < 26; j++){
            if(ch[j]==false){
                return false;
            }
        }
        return true;
    }
}