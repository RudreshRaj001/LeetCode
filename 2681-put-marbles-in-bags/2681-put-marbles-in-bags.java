class Solution {
    public long putMarbles(int[] weights, int k) {
        if(k == 1) return 0;
        ArrayList<Integer> splits = new ArrayList<>();
        for(int i = 0; i < weights.length - 1; i++){
            splits.add(weights[i] + weights[i + 1]);
        }
        splits.sort(null);
        long max = sum(true, k, splits);
        long min = sum(false, k, splits);
        return max - min;
    }
    private long sum(boolean flag, int k, ArrayList<Integer> splits){
        long sum = 0;
        if(flag){
            int i = splits.size() - 1;
            while(k > 1){
                sum += splits.get(i);
                i--;
                k--;
            }
        }else{
            int i = 0;
            while(k > 1){
                sum += splits.get(i);
                i++;
                k--;
            }
        }
        return sum;
    }
}