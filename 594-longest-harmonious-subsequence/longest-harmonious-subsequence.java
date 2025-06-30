class Solution {
    public int findLHS(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            }

            int x = nums[i] - 1;

            if (map.containsKey(x)) {
                ans = Math.max(i - map.get(x) + 1, ans);
            }
        }
        return ans;
    }
}