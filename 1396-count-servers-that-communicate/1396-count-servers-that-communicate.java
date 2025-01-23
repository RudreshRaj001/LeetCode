class Solution {
    public int countServers(int[][] grid) {
        // index, counr
        HashMap<Integer, Integer> rowMap = new HashMap<>();
        HashMap<Integer, Integer> colMap = new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1){
                    rowMap.put(i,  rowMap.getOrDefault(i, 0) + 1);
                    colMap.put(j,  colMap.getOrDefault(j, 0) + 1);
                }
            }
        }

        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1){
                    int rc = rowMap.getOrDefault(i, 0);
                    int cc = colMap.getOrDefault(j, 0);
                    if(rc > 1 || cc > 1){
                        res++;
                    }
                }
            }
        }
        return res;
    }
}