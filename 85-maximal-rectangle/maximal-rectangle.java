class Solution {
    public int maximalRectangle(char[][] mat) {
        int n = mat.length, m = mat[0].length;

        
        int[][] memo = new int[n][m];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == '0') continue;

                
                if (j == 0) memo[i][j] = 1;
                else memo[i][j] = 1 + memo[i][j - 1];

                int width = memo[i][j];

                
                for (int k = i; k >= 0; k--) {
                    width = Math.min(width, memo[k][j]);
                    int area = width * (i - k + 1);

                    ans = Math.max(ans, area);
                }
            }
        }

        return ans;
    }
}