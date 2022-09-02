class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length; // Length of Rows
        int n = obstacleGrid[0].length;
        // Coloumns of Columns
        if(obstacleGrid[0][0] == 1)
            return 0;
        for(int i = 0;i<m;i++){
            for(int j =0;j<n;j++){
                if(i == 0|| j == 0){
                    if(obstacleGrid[i][j] == 1 || (i!=0 && obstacleGrid[i-1][0] == 0) || (j!=0 && obstacleGrid[i][j-1] == 0)){
                        obstacleGrid[i][j] = 0;
                    }
                    else{
                        obstacleGrid[i][j] = 1;
                        }
                }
                else{
                    if(obstacleGrid[i][j] == 1){
                        obstacleGrid[i][j] = 0;
                    }
                    else{
                        obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
                    }
                }
                
        //        if(obstacleGrid[i][j] == 1){
        //             obstacleGrid[i][j] = 0;
        //         }
        //         else if(i == 0 || j == 0){
        //             obstacleGrid[i][j] = 1;
        //         }
        //         else {
        //             obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
        //         }
            }
        }
        return obstacleGrid[m-1][n-1];
    }
}