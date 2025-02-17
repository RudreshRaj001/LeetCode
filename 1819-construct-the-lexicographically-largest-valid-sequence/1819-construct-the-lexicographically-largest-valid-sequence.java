class Solution {
    public int[] constructDistancedSequence(int n) {
        int[] res = new int[2 * n - 1];
        boolean[] used = new boolean[n + 1]; // To track used numbers

        backtrack(0, res, n, used);
        return res;
    }

    private boolean backtrack(int i, int[] res, int n, boolean[] used) {
        if (i == res.length) return true;  // If array is completely filled, return true
        if (res[i] != 0) return backtrack(i + 1, res, n, used); // Skip filled positions
        
        for (int j = n; j >= 1; j--) {
            if (used[j]) continue; // Skip if already used
            if (j > 1 && (i + j >= res.length || res[i + j] != 0)) continue; // Check valid placement

            // Place `j` at `i` and `i + j` if needed
            res[i] = j;
            if (j > 1) res[i + j] = j;
            used[j] = true;

            if (backtrack(i + 1, res, n, used)) return true; // Recur for next index

            // Undo placement (Backtrack)
            res[i] = 0;
            if (j > 1) res[i + j] = 0;
            used[j] = false;
        }
        return false;
    }
}