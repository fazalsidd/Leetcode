class Solution {
    // public int helper(String w1, String w2,int i,int j,int dp[][])
    // {
        // if(i==w1.length()&&j==w2.length())
        //     return 0;
        // if(i==w1.length())
        // {
        //     return (w2.length()-j);
        // }
        // if(j==w2.length())
        // {
        //     return (w1.length()-i);
        // }
        // if(dp[i][j]!=-1)
        //    return dp[i][j];
        // int p=Integer.MAX_VALUE;
        // int q=Integer.MAX_VALUE;
        // int r=Integer.MAX_VALUE;
        // if(w1.charAt(i)==w2.charAt(j))
        // {
        //     p=helper(w1,w2,i+1,j+1,dp);
        // }
        // else
        // {
        //     p=1+helper(w1,w2,i,j+1,dp);
        //     q=1+helper(w1,w2,i+1,j,dp);
        //     r=1+helper(w1,w2,i+1,j+1,dp);
        // }
        // return dp[i][j]= Math.min(p,Math.min(q,r));
   // }
    public int minDistance(String w1, String w2) {
        if(w1.length()==0)
            return w2.length();
        if(w2.length()==0)
            return w1.length();
        int dp[][]=new int[w1.length()+1][w2.length()+1];
       //Arrays.stream(dp).forEach(a -> Arrays.fill(a, 10000));
        for(int i=0;i<=w1.length();i++)
        {
            for(int j=0;j<=w2.length();j++)
            {
                if(i==0)
                {
                    dp[i][j]=j;
                }
                else if(j==0)
                {
                    dp[i][j]=i;
                }
                else
                {
                    if(w1.charAt(i-1)==w2.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=1+Math.min(dp[i][j-1],Math.min(dp[i-1][j],dp[i-1][j-1]));
                }
                }
            }
        }
        return dp[w1.length()][w2.length()];
    }
}