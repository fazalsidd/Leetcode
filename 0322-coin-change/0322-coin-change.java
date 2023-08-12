class Solution {
    int flag=0;
    public int helper(int[] coins, int amount,int dp[])
    {
        if(amount==0)
            {
            flag=1;
            return 0;}
        if(amount<0)
            return 1000;
        if(dp[amount]!=Integer.MAX_VALUE)
            return dp[amount];
        for(int i=0;i<coins.length;i++)
        {
            dp[amount]=Math.min(dp[amount],1+helper(coins,amount-coins[i],dp));
        }
        return dp[amount];
    }
    public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        int ans=helper(coins,amount,dp);
        if(flag==0)
            return -1;
        return ans;
    }
}