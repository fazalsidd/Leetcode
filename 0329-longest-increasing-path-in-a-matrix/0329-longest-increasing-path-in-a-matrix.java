class Solution {
    public int helper(int[][] mat,int i,int j,int prev,int dp[][])
    {
        if(i<0||i>=mat.length||j<0||j>=mat[0].length)
            return 0;
        if(mat[i][j]<=prev)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        
        int up=1+helper(mat,i-1,j,mat[i][j],dp);
        int down=1+helper(mat,i+1,j,mat[i][j],dp);
        int left=1+helper(mat,i,j-1,mat[i][j],dp);
        int right=1+helper(mat,i,j+1,mat[i][j],dp);
        
        return dp[i][j]=Math.max(up,Math.max(down,Math.max(left,right)));
    }
    public int longestIncreasingPath(int[][] mat) {
        int ans=0;
        int dp[][]=new int[mat.length][mat[0].length];
        int m=mat.length;
        int n=mat[0].length;
         Arrays.stream(dp).forEach(a -> Arrays.fill(a, -1));
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(dp[i][j]==-1)
                    ans=Math.max(ans,helper(mat,i,j,-1,dp));
                
                ans=Math.max(ans,dp[i][j]);
            }
        }
        return ans;
    }
}