class Solution {
    public long helper(int i,int[][] q,long dp[])
    {
        if(i>=q.length)
            return 0;
        if(dp[i]!=0)
            return dp[i];
         long ans=-1;
        long inc=q[i][0]+helper(i+q[i][1]+1,q,dp);
        long exc=helper(i+1,q,dp);
        ans=Math.max(ans,Math.max(inc,exc));
        return dp[i]=ans;
    }
    public long mostPoints(int[][] q) {
        long dp[]=new long[q.length];
        return helper(0,q,dp);
    }
}