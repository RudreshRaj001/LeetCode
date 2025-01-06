class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        List<Integer> balls = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(boxes.charAt(i) == '1'){
                balls.add(i);
            } 
        }
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int ind : balls){
                sum += Math.abs(ind - i);
            }
            ans[i] = sum;
        }
        return ans;
    }
}