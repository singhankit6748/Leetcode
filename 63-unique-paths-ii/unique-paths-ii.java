class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int rows = obstacleGrid.length;
        int cols = obstacleGrid[0].length;
        
       
        if (obstacleGrid[0][0] == 1) return 0;

        int[][] pathCount = new int[rows][cols];
        pathCount[0][0] = 1;

        
        for (int col = 1; col < cols; col++) {
            pathCount[0][col] = (obstacleGrid[0][col] == 0 && pathCount[0][col - 1] == 1) ? 1 : 0;
        }
        
        
        for (int row = 1; row < rows; row++) {
            pathCount[row][0] = (obstacleGrid[row][0] == 0 && pathCount[row - 1][0] == 1) ? 1 : 0;
        }
   
        for (int row = 1; row < rows; row++) {
            for (int col = 1; col < cols; col++) {
                    if ( obstacleGrid[row][col] == 0 ) {
                     pathCount[row][col] = pathCount[row - 1][col] + pathCount[row][col - 1];
                    }
                    else{
                         pathCount[row][col] =0;
                    }
                }
            }
        return pathCount[rows - 1][cols - 1];    
    }
}