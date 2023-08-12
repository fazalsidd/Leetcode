class Solution {
    public int helper(int[][] obs,int i,int j,int dp[][])
    {
         if(i>=obs.length ||j>=obs[0].length)
            return 0;
        
        if(obs[i][j]==1)
            return 0;
        
        if(i==obs.length-1 && j==obs[0].length-1)
            return 1;
        if(dp[i][j]!=-1)
        return dp[i][j];
        
        int p=helper(obs,i+1,j,dp)+helper(obs,i,j+1,dp);
        
        dp[i][j]= p;
        return dp[i][j];
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int dp[][]=new int[obstacleGrid.length][obstacleGrid[0].length];
        Arrays.stream(dp).forEach(a -> Arrays.fill(a, -1));
        return helper(obstacleGrid,0,0,dp);
    }
}