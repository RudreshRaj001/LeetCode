class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        res.get(0).add(1);  // Initialize the first row with a single 1

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = res.get(i - 1);
            List<Integer> row = new ArrayList<>();
            
            row.add(1);  // Start the row with 1

            for (int j = 1; j < prevRow.size(); j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            row.add(1);  // End the row with 1
            res.add(row);
        }
        
        return res;
    }
}
