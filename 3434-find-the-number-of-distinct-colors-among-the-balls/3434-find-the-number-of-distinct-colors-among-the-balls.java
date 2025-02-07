class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer, Integer> balls = new HashMap<>();
        HashMap<Integer,Integer> clr = new HashMap<>();
        int n = queries.length;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            int ball = queries[i][0];
            int clur = queries[i][1];
            if(balls.containsKey(ball)){
                int prevClr = balls.get(ball);
                clr.put(prevClr,clr.get(prevClr) - 1);
                if(clr.get(prevClr) == 0){
                    clr.remove(prevClr);
                }
            }
            balls.put(ball, clur);
            clr.put(clur,clr.getOrDefault(clur, 0) + 1);
            ans[i] = clr.size();
        }
        return ans;
    }
}