class Solution {
    public char findTheDifference(String s, String t) {
        int sSum = 0;
        int tSum = 0;

        int tlen =  t.length();
        for(int i = 0; i < tlen; i++){
            if(i < tlen - 1){
                char temps = s.charAt(i);
                sSum += (int)temps;
            }
            char tempt = t.charAt(i);
            tSum += (int)tempt;
        }
        return (char)(tSum - sSum);
    }
}