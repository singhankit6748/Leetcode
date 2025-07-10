class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n= triangle.size();
        int[][] dp = new int[n][n];
        for(int[] itr: dp){
            Arrays.fill(itr, -1);
        }
        return helper(dp, triangle,0,0);

    }
    public int helper(int[][] dp,List<List<Integer>> triangle, int i, int j){
        int n = triangle.size();
        if(i== n-1) return triangle.get(i).get(j);
        
        if(dp[i][j] != -1) return dp[i][j];

        return dp[i][j] = triangle.get(i).get(j) +Math.min(helper(dp,triangle, i+1,j), helper(dp, triangle, i+1, j+1));

    }
}