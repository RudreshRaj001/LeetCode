class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        int n = items.length;
        int m = queries.length;
        // Arrays.sort(items);
        Arrays.sort(items, Comparator.comparingInt(a -> a[0])); // sorting items based on prices
        // Arrays.sort(queries);

        int[][] queriesWithIndex = new int[queries.length][2];
        for (int i = 0; i < queries.length; i++) {
            queriesWithIndex[i][0] = queries[i];
            queriesWithIndex[i][1] = i;
        }
        Arrays.sort(queriesWithIndex, Comparator.comparingInt(a -> a[0]));



        int[] beauties = new int[m];
        int maxBeauty = 0;
        int i = 0;

        // for(int i = 0; i < m; i++){
        //     int query = queries[i];
        //     int maxBeauty = 0;
        //     for(int j = 0; j < n; j++){
        //         if(items[j][0] <= query){
        //             if(maxBeauty < items[j][1]){
        //                maxBeauty = items[j][1];
        //             }
        //         }
        //     }
        //     beauties[i] = maxBeauty;
        // }

        for (int[] queryWithIndex : queriesWithIndex) {
            int query = queryWithIndex[0];
            int index = queryWithIndex[1];

            while (i < items.length && items[i][0] <= query) {
                maxBeauty = Math.max(maxBeauty, items[i][1]);
                i++;
            }

            beauties[index] = maxBeauty;
        }

        return beauties;
    }
}