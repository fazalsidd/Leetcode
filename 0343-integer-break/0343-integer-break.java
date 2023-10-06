class Solution {
    public int helper(int n,int dp[])
    {
        if(n<=2)
        return 1;
        if(dp[n]!=-1)
        return dp[n];
        int max=Integer.MIN_VALUE;
        for(int i=1;i<n;i++)
        {
            max=Math.max(max,Math.max(i*helper(n-i,dp),i*(n-i)));
        }
        return dp[n]=max;
    }
    public int integerBreak(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n,dp);
    }
}