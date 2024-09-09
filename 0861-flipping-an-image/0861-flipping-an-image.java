class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int len = image[0].length;
        int mid = (len + 1) / 2;
        for (int[] row : image) {
            for (int i = 0; i < mid; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[len - 1 - i] ^ 1;
                row[len - 1 - i] = temp;
            }
        }
        return image;
    }
}