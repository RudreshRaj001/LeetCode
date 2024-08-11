class Solution {
    public List<Integer> findDuplicates(int[] a) {
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

        List<Integer> List = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            if (a[j] != j + 1) {
                List.add(a[j]);
            }
        }

        return List; 
    }

    void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}