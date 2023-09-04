class Solution {
    public int helper(String w1, String w2,int i,int j,int dp[][])
    {
        if(i==w1.length()&&j==w2.length())
            return 0;
        if(i==w1.length())
        {
            return (w2.length()-j);
        }
        if(j==w2.length())
        {
            return (w1.length()-i);
        }
        if(dp[i][j]!=-1)
           return dp[i][j];
        int p=Integer.MAX_VALUE;
        int q=Integer.MAX_VALUE;
        int r=Integer.MAX_VALUE;
        if(w1.charAt(i)==w2.charAt(j))
        {
            p=helper(w1,w2,i+1,j+1,dp);
        }
        else
        {
            p=1+helper(w1,w2,i,j+1,dp);
            q=1+helper(w1,w2,i+1,j,dp);
            r=1+helper(w1,w2,i+1,j+1,dp);
        }
        return dp[i][j]= Math.min(p,Math.min(q,r));
    }
    public int minDistance(String w1, String w2) {
        int dp[][]=new int[w1.length()][w2.length()];
         Arrays.stream(dp).forEach(a -> Arrays.fill(a, -1));
        return helper(w1,w2,0,0,dp);
    }
}