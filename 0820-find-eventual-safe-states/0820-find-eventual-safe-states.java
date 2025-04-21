class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        boolean[] visited = new boolean[n];
        boolean[] onPath = new boolean[n];
        boolean[] safe = new boolean[n];
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (dfs(i, graph, visited, onPath, safe)) {
                ans.add(i);
            }
        }

        return ans;
    }

    private boolean dfs(int node, int[][] graph, boolean[] visited, boolean[] onPath, boolean[] safe) {
        if (visited[node]) return safe[node]; // return already known result

        visited[node] = true;
        onPath[node] = true;

        for (int neighbor : graph[node]) {
            if (onPath[neighbor] || !dfs(neighbor, graph, visited, onPath, safe)) {
                return false;
            }
        }

        onPath[node] = false;
        safe[node] = true;
        return true;
    }
}