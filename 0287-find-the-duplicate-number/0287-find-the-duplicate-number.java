class Solution {
    public int findDuplicate(int[] a) {
        int i = 0;
        int n = a.length;
        while (i < n) {
            if (a[i] != i + 1) {
                int correctIndex = a[i] - 1;
                if (a[i] != a[correctIndex]) {
                    // swap
                    swap(a, i, correctIndex);
                } else {
                    return a[i];
                }
            } else {
                i++;
            }
        }
        return -1; // this never happens
    }

    void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}