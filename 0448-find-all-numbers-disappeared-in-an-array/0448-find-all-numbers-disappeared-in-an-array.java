class Solution {
    public List<Integer> findDisappearedNumbers(int[] a) {
        List<Integer> list = new ArrayList<Integer>();
        int i = 0;
        int n = a.length;
        while (i < n) {
            int correctIndex = a[i] - 1;
            if (correctIndex < n && a[i] != a[correctIndex]) {
                // swap
                swap(a, i, correctIndex);
            } else {
                i++;
            }
        }

        // search for missing index
        for (int j = 0; j < n; j++) {
            if (a[j] != j + 1) {
                list.add(j+1);
            }
        }

        return list;
    }

    void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}