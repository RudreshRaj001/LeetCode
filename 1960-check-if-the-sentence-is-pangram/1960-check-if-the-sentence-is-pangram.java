class Solution {
    public boolean checkIfPangram(String sentence) {
        // int a = 2847;
        // for(int i = 0; i <= sentence.toCharArray().length; i++){
        //     a -= sentence[i];
        // }
        // return a == 0;
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