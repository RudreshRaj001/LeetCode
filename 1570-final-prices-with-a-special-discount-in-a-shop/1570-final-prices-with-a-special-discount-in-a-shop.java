class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int n = prices.length;
        stack.push(n-1);
        int ans[] = new int[n];
        ans[n - 1] = prices[n - 1];
        for(int i = n - 2; i >= 0; i--){
            while(!stack.isEmpty() && prices[i] < prices[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = prices[i];
            }else{
                ans[i] = prices[i] - prices[stack.peek()];
            }
            stack.push(i);
        }
        return ans;
    }
}