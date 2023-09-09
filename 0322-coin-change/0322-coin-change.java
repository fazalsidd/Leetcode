class Solution {
    public int helper(int[] coins, int a,int j,int dp[][])
    {
        if(a==0)
            return 0;
        if(dp[a][j]!=-1)
            return dp[a][j];
        int ans=100000;
        for(int i=j;i<coins.length;i++)
        {
            if(a-coins[i]>=0)
            {
                ans=Math.min(ans,1+helper(coins,a-coins[i],i,dp));
            }
        }
        return dp[a][j]=ans;
        
    }
    public int coinChange(int[] coins, int a) {
        int dp[][]=new int[a+1][coins.length];
        Arrays.stream(dp).forEach(b -> Arrays.fill(b, -1));
        int ans=helper(coins,a,0,dp);
        return ans>=100000?-1:ans;
    }
}