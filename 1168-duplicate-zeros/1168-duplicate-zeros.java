class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int j = 0;
        for(int i = 0; i < n; i++){
            ans.add(arr[i]);
            if(arr[i] == 0){
                ans.add(0);
            }  
        }

        for(int i = 0; i < n; i++){
            arr[i] = ans.get(i);
        }
    }
}