class Solution {
    public int largestAltitude(int[] gain) {
        int alt = 0;
        int highestAlt = alt;
        for(int i = 0; i < gain.length; i++){
            alt += gain[i];
            if(alt > highestAlt){
                highestAlt = alt;
            }
        }
        return highestAlt;
    }
}