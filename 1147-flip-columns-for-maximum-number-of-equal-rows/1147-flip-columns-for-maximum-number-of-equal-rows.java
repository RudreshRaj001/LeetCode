class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int[] row : matrix){
            StringBuilder key = new StringBuilder();
            if(row[0] == 1){
                for (int n : row) {
                    key.append(n == 0 ? 1 : 0);
                }
            } else{
                for (int n : row) {
                    key.append(n);
                }
            }
            // int oldValue = map.getOrDefault(key.toString(), 0);
            // map.put(key.toString(), oldValue + 1);
            map.merge(key.toString(),1,(A, B)->A+B);
        }
        return Collections.max(map.values());
    }

}