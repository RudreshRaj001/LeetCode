class Solution {
    public int[] findErrorNums(int[] a) {
        int i = 0;
        int n = a.length;
        while (i < n) {
            int correctIndex = a[i] - 1;
            if (a[i] != a[correctIndex]) {
                // swap
                swap(a, i, correctIndex);
            } else {
                i++;
            }
        }

        // search for missing index
        for (int j = 0; j < n; j++) {
            if (a[j] != j + 1) {
                return new int[]{a[j], j + 1};
            }
        }

        // case 2
        return new int[]{-1, -1};
    }

    void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}