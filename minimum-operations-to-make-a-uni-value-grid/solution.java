 
import java.util.Arrays;

public class Solution {  
    public int minOperations(int[][] grid, int x) {
        
        int m = grid.length, n = grid[0].length;
        int[] nums = new int[m * n];
        int index = 0;

        for (int[] row : grid) {
            for (int num : row) {
                nums[index++] = num;
            }
        }

        
        int remainder = nums[0] % x;
        for (int num : nums) {
            if (num % x != remainder) {
                return -1; 
            }
        }

     
        Arrays.sort(nums);
        int median = nums[nums.length / 2];

        
        int operations = 0;
        for (int num : nums) {
            operations += Math.abs(num - median) / x;
        }

        return operations;
    }

   
    public static void main(String[] args) {
        Solution sol = new Solution(); 

        int[][] grid1 = {{2, 4}, {6, 8}};
        int x1 = 2;
        System.out.println(sol.minOperations(grid1, x1)); 
        int[][] grid2 = {{1, 5}, {2, 3}};
        int x2 = 1;
        System.out.println(sol.minOperations(grid2, x2)); 
        int[][] grid3 = {{1, 2}, {3, 4}};
        int x3 = 2;
        System.out.println(sol.minOperations(grid3, x3)); 
    }
}
