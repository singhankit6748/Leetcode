class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int orgCol = image[sr][sc];
        if (orgCol == color) return image;  // ✅ No need to flood if already same color

        boolean[][] vis = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, orgCol);
        return image;
    }

    public void helper(int[][] image, int sr, int sc, int color, boolean[][] vis, int orgCol) {
        // ✅ Base Case: Out of bounds, already visited, or different color
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length ||
            vis[sr][sc] || image[sr][sc] != orgCol) {
            return;
        }

        // \U0001f3a8 Fill color & mark visited
        image[sr][sc] = color;
        vis[sr][sc] = true;

        // \U0001f504 Recursive calls in all four directions
        helper(image, sr, sc - 1, color, vis, orgCol); // left
        helper(image, sr, sc + 1, color, vis, orgCol); // right
        helper(image, sr - 1, sc, color, vis, orgCol); // up
        helper(image, sr + 1, sc, color, vis, orgCol); // down
    }
}