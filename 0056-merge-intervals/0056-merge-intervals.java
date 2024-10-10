class Solution {
    public int[][] merge(int[][] intervals) {
        // Sort intervals based on the starting value
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        temp.add(intervals[0][0]);
        temp.add(intervals[0][1]);

        for(int i = 1; i < intervals.length; i++){
            int tmp0 = temp.get(0);
            int tmp1 = temp.get(1);
            int newtmp0 = intervals[i][0];
            int newtmp1 = intervals[i][1];

            if(newtmp0 <= tmp1){
                temp.set(1, Math.max(tmp1, newtmp1));
            }else{
                ans.add(new ArrayList<>(temp));
                temp.set(0, newtmp0);
                temp.set(1, newtmp1);
            }
        }
        ans.add(new ArrayList<>(temp));
        return convertTo2DArray(ans);
    }

    static int[][] convertTo2DArray(List<List<Integer>> list) {
        int rows = list.size();
        int cols = 2;
        int[][] array = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = list.get(i).get(j);
            }
        }
        
        return array;
    }
}