import java.util.*;

class Solution {
    public int[][] specialGrid(int N) {
        return build(N, 0);
    }

    private int[][] build(int n, int start) {
        if (n == 0) {
            return new int[][]{{start}};
        }

        int size = 1 << n; 
        int half = size / 2;
        int count = half * half;

        int[][] topRight = build(n - 1, start);
        int[][] bottomRight = build(n - 1, start + count);
        int[][] bottomLeft = build(n - 1, start + 2 * count);
        int[][] topLeft = build(n - 1, start + 3 * count);

        int[][] grid = new int[size][size];
        for (int i = 0; i < half; i++) {
            System.arraycopy(topLeft[i], 0, grid[i], 0, half);
            System.arraycopy(topRight[i], 0, grid[i], half, half);
        }
        for (int i = 0; i < half; i++) {
            System.arraycopy(bottomLeft[i], 0, grid[i + half], 0, half);
            System.arraycopy(bottomRight[i], 0, grid[i + half], half, half);
        }

        return grid;
    }

    
    public static void main(String[] args) {
        Solution sol = new Solution();
        int N = 2; 
        int[][] result = sol.specialGrid(N);
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
