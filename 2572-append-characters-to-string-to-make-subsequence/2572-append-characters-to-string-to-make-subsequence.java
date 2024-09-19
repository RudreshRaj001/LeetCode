class Solution {
    public int appendCharacters(String t, String s) {
        int lenS = s.length();
        if(lenS == 0) return 0;
        int lenT = t.length();
        int j = 0;

        for (int i = 0; i < lenT; i++) {
            if(t.charAt(i) == s.charAt(j)){
                j++;
            }
            if(j == lenS){
                return 0;
            }
        }
        return lenS - j;
    }
}