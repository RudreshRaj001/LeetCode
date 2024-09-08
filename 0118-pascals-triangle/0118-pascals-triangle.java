class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList();
        result.add(new ArrayList<>());
        result.get(0).add(1); // Initializing the First Row

        for(int i = 1; i < numRows; i++){
            List<Integer> prevRow = result.get(i-1);
            List<Integer> row = new ArrayList<>();

            row.add(1); // start the row with 1
            for(int j = 1; j < prevRow.size(); j++){
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            row.add(1);
            result.add(row);
        }

        return result;
    }
}
