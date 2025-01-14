class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        HashSet <Integer> intA = new HashSet<>();
        HashSet <Integer> intB = new HashSet<>();
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            intA.add(A[i]);
            intB.add(B[i]);
            int cnt = 0;
            for(int x : intA){
                if(intB.contains(x)){
                    cnt++;
                }
            }
            ans[i] = cnt;
        }
        return ans;
    }
}