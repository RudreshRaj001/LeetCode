class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int h = 0;
        for (int i = 0; i < n; i++) {
            h++;
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(citations[j] >= h){
                    count++;
                }
                if(count == h){
                    break;
                }
            }
            if(h > count){
                return h - 1;
            }
        }
        return h;
    }
}