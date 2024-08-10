class Solution {
    public int missingNumber(int[] a) {
        int i = 0;
        int n = a.length;
        while (i < n) {
            int correctIndex = a[i];
            if (a[i] < n && a[i] != a[correctIndex]) {
                // swap
                swap(a, i, correctIndex);
            } else {
                i++;
            }
        }

        for(int index = 0; index < n; index++){
            if(a[index]!=index){
                return index;
            }
        }

        return n;
    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}