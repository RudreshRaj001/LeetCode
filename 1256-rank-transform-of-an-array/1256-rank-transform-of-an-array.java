class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        Arrays.sort(copy);
        HashMap<Integer, Integer> map = new HashMap<>();
        int j = 1;
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(copy[i])) {
                map.put(copy[i], j);
                j++;
            }
        }

        for(int i = 0; i < arr.length; i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}