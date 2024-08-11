class Solution {
    public int firstMissingPositive(int[] a) {
        int i = 0;
        int n = a.length;
        while (i < n) {
            int correctIndex = a[i] - 1;
            if (a[i] <= n && a[i] > 0 && a[i] != a[correctIndex]) {
                // swap
                swap(a, i, correctIndex);
            } else {
                i++;
            }
        }
        // [3,4,-1,1] 
        // [3,4,-1,1] 
        for (int j = 0; j < n; j++) {
            if (a[j] != j + 1) {
                return j + 1;
            }
        }
        return n + 1;
    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}