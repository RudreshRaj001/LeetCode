class Solution {
    public int findChampion(int n, int[][] edges) {
        int[] arr = new int[n];
        for(int i = 0; i < edges.length; i++){
            arr[edges[i][1]]++;
        }

        int champ = -1;
        int cnt = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                champ = i;
                cnt++;
            }
            if(cnt > 1){
                return -1;
            }
        }
        return champ;
    }
}