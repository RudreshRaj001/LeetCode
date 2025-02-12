class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        ArrayList<Integer>[] arr = new ArrayList[n + 1];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int key : map.keySet()) {
            int index = map.get(key);
            if (arr[index] == null) { 
                arr[index] = new ArrayList<>();
            }
            arr[index].add(key);
        }

        int[] ans = new int[k];
        int j = 0;
        for (int i = n; i >= 0 && j < k; i--) {
            if(arr[i] != null){
                Collections.sort(arr[i], Collections.reverseOrder());
                for (Integer num : arr[i]) {
                    System.out.println(num);
                    ans[j++] = num;
                    if (j == k) return ans;
                }
            }
        }
        return ans;
    }
}