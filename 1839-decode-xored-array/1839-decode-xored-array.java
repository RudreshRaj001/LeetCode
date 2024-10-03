class Solution {
    public int[] decode(int[] encoded, int first) {
        int l = encoded.length;
        int[] res = new int[l + 1];
        res[0] = first;
        for (int i = 0; i < l; i++) {
            res[i + 1] = res[i] ^ encoded[i];
        }
        return res;
    }
}