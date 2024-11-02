class Solution {
    public char findTheDifference(String s, String t) {
        int sSum = 0;
        int tSum = 0;

        int tlen =  t.length();
        for(int i = 0; i < tlen; i++){
            if(i < tlen - 1){
                sSum += (int)(s.charAt(i));
            }
            tSum += (int)(t.charAt(i));
        }
        return (char)(tSum - sSum);
    }
}