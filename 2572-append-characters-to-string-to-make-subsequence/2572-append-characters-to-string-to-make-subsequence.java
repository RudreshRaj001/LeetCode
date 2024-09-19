class Solution {
    public int appendCharacters(String s, String t) {
        int lenT = t.length();
        if(lenT == 0) return 0;
        int lenS = s.length();
        int j = 0;

        for (int i = 0; i < lenS; i++) {
            if(s.charAt(i) == t.charAt(j)){
                j++;
            }
            if(j == lenT){
                return 0;
            }
        }
        return lenT - j;
    }
}