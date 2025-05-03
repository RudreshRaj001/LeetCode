class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int t1 = tops[0];
        int t2 = bottoms[0];


        int mt = 0;
        int mb = 0;
        for(int i = 0; i < tops.length; i++){
            if(!(tops[i] == t1 || bottoms[i] == t1)) break;
            if(tops[i] != t1) mt++;
            if(bottoms[i] != t1) mb++;
            if(i == tops.length - 1){
                return Math.min(mt, mb);
            }
        }

        mt = 0;
        mb = 0;
        for(int i = 0; i < tops.length; i++){
            if(!(tops[i] == t2 || bottoms[i] == t2)) break;
            if(tops[i] != t2) mt++;
            if(bottoms[i] != t2) mb++;
            if(i == tops.length - 1){
                return Math.min(mt, mb);
            }
        }
        return -1;
    }
}