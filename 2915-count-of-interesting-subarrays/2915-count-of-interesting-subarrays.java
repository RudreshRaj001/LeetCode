class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        int cnt = 0;
        long ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int j = 0; j < nums.size(); j++) {
            if (nums.get(j) % modulo == k) {
                cnt++;
            }
            // cnt += nums.get(j);
            int n = cnt % modulo;
            int tar = (n - k + modulo) % modulo;

            ans += map.getOrDefault(tar, 0);

            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        return ans;
    }
}