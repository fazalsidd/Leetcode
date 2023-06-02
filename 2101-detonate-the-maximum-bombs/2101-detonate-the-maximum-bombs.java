class Solution {
    int ans=0;
    public boolean dist(int x1,int y1,int x2,int y2,int r)
    {
     double dist = Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
            return r >= dist;
    }
    public void helper(int[][] b,int dp[],int i)
    {
        if(dp[i]==1)
            return;
        dp[i]=1;
        
        ans++;
        
        for(int j=0;j<b.length;j++)
        {
            if(j!=i)
            {
                if(dist(b[i][0],b[i][1],b[j][0],b[j][1],b[i][2]))
                {
                  helper(b,dp,j);
                }
            }
        }
    }
    public int maximumDetonation(int[][] b) {
        int dp[]=new int[b.length];
        int ans1=Integer.MIN_VALUE;
        for(int i=0;i<b.length;i++)
        {
            Arrays.fill(dp,0);
            helper(b,dp,i);
            ans1=Math.max(ans1,ans);
            ans=0;
        }
        return ans1;
    }
}