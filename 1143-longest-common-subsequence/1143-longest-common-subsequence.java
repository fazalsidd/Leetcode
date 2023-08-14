class Solution {
    public int longestCommonSubsequence(String t1, String t2) {
        int dp[][]=new int[t1.length()][t2.length()];
        for(int i=0;i<t1.length();i++)
        {
            for(int j=0;j<t2.length();j++)
            {
                if(t1.charAt(i)==t2.charAt(j))
                {
                    dp[i][j]=1;
                    if(i==0||j==0)
                {
                        dp[i][j]=1;
                }
                else
                {
                  dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j-1]+1);
                }
                }
                else
                {
                    if(j!=0&&i!=0)
                        dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                    else if(i==0&&j==0)
                        dp[i][j]=0;
                    else if(i==0)
                        dp[i][j]=dp[i][j-1];
                    else
                        dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[t1.length()-1][t2.length()-1];
    }
}