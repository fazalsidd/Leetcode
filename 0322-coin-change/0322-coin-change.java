class Solution {
    public int coinChange(int[] coins, int a) {
        int dp[]=new int[a+1];
        Arrays.fill(dp,100000);
        dp[0]=0;
        for(int i=1;i<=a;i++)
        {
            for(int j=0;j<coins.length;j++)
            {
                if(i-coins[j]>=0)
                    dp[i]=Math.min(dp[i],1+dp[i-coins[j]]);
            }
        }
        return dp[a]>=100000?-1:dp[a];
    }
}