class Solution {
    public long mostPoints(int[][] questions) {
        long[] cache = new long[questions.length];
        Arrays.fill(cache, -1);
        return backtrack(questions, 0, cache);
    }

    private long backtrack(int[][] questions, int i, long[] cache) {
        if (i >= questions.length)
            return 0;
        if (cache[i] != -1)
            return cache[i];

        long pick = questions[i][0] + backtrack(questions, i + questions[i][1] + 1, cache);
        long nopick = backtrack(questions, i + 1, cache);
        cache[i] = Math.max(pick, nopick);
        return cache[i];
    }
}