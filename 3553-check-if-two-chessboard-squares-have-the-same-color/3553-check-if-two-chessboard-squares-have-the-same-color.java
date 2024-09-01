class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        return color(coordinate1) == color(coordinate2);
    }
    public int color(String c){
        if((int)c.charAt(0) % 2 == 0){
            return ((int)c.charAt(1) - 48) % 2 == 0 ? 0 : 1;
        }else{
            return ((int)c.charAt(1) - 48) % 2 == 0 ? 1 : 0;
        }
    }
}