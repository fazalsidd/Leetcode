class Solution {
//     public int helper(int[][] mat,int[][] dp,int i,int j)
//     {
//         if(i>=mat.length)
//             return 0;
//         if(j<0||j>=mat[0].length)
//             return 100000;
//         if(dp[i][j]!=-1)
//             return dp[i][j];
        
//         int a=mat[i][j]+helper(mat,dp,i+1,j-1);
//          int b=mat[i][j]+helper(mat,dp,i+1,j);
//          int c=mat[i][j]+helper(mat,dp,i+1,j+1);
        
//         return dp[i][j]=Math.min(a,Math.min(b,c));
//     }
    public int minFallingPathSum(int[][] mat) {
        int dp[][]=new int[mat.length][mat[0].length];
        int ans=Integer.MAX_VALUE;
        
        
        for(int i=mat.length-1;i>=0;i--)
        {
            for(int j=0;j<mat.length;j++)
            {
                 if(i==mat.length-1)
                     dp[i][j]=mat[i][j];
                else
                {
                    dp[i][j]=mat[i][j]+dp[i+1][j];
                    if(j-1>=0)
                        dp[i][j]=Math.min(dp[i][j],mat[i][j]+dp[i+1][j-1]);
                    if(j+1<mat.length)
                        dp[i][j]=Math.min(dp[i][j],mat[i][j]+dp[i+1][j+1]);
                }
                if(i==0)
                    ans=Math.min(ans,dp[i][j]);
            }
        }
        
        return ans;
    }
}