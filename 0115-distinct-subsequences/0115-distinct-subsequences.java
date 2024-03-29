class Solution {
//     public int helper(String s, String t,int i,int j,int dp[][])
//     {
//         if(j>=t.length())
//             return 1;
//         if(i>=s.length())
//             return 0;
//         if(dp[i][j]!=-1)
//             return dp[i][j];
        
//         int exc=helper(s,t,i+1,j,dp);
//         int inc=0;
//         if(s.charAt(i)==t.charAt(j))
//             inc=helper(s,t,i+1,j+1,dp);
        
//         return dp[i][j]=inc+exc;
            
//     }
    public int numDistinct(String s, String t) {
        int dp[][]=new int[t.length()+1][s.length()+1];
        for(int i=t.length();i>=0;i--)
        {
            for(int j=s.length();j>=0;j--)
            {
                if(i==t.length())
                    dp[i][j]=1;
                else if(j==s.length())
                    dp[i][j]=0;
                else
                {
                    if(s.charAt(j)==t.charAt(i))
                    {
                        dp[i][j]=dp[i+1][j+1]+dp[i][j+1];
                    }
                    else
                    {
                        dp[i][j]=dp[i][j+1];
                    }
                }
            }
        }
        return dp[0][0];
        
    }
}