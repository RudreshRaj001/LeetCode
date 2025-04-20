class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visited = new boolean[n][m];
        int islands = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(visited[i][j] || grid[i][j] == '0') continue;
                islands++;
                helper(grid, visited, i, j);
            }
        }
        return islands;
    }
    private void helper(char[][] grid, boolean[][] visited, int i, int j){
         int n = grid.length;
         int m = grid[0].length;
         Queue<int[]> queue = new LinkedList<>();
         queue.offer(new int[]{i, j});
         visited[i][j] = true;

         int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};

         while (!queue.isEmpty()) {
            int size = queue.size();
            for (int k = 0; k < size; k++) {
                int[] curr = queue.poll();
                int r = curr[0], c = curr[1];

                for (int[] d : dirs) {
                    int nr = r + d[0];
                    int nc = c + d[1];

                    if (nr >= 0 && nr < n && nc >= 0 && nc < m && !visited[nr][nc] && grid[nr][nc] == '1') {
                        visited[nr][nc] = true;
                        queue.offer(new int[]{nr, nc});
                    }
                }
            }
         }
    }
}