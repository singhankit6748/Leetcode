class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int prev = cost[0], curr = cost[1];
        for (int i = 2; i < n; i++) {
            int res = cost[i] + Math.min(prev, curr);
            prev = curr;
            curr = res;
        }
        return Math.min(prev, curr);
    }
}