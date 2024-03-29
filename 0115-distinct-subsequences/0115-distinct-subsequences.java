class Solution {
    public int helper(String s, String t,int i,int j,int dp[][])
    {
        if(j>=t.length())
            return 1;
        if(i>=s.length())
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        
        int exc=helper(s,t,i+1,j,dp);
        int inc=0;
        if(s.charAt(i)==t.charAt(j))
            inc=helper(s,t,i+1,j+1,dp);
        
        return dp[i][j]=inc+exc;
            
    }
    public int numDistinct(String s, String t) {
        int dp[][]=new int[s.length()+1][t.length()+1];
        Arrays.stream(dp).forEach(a -> Arrays.fill(a, -1));
        return helper(s,t,0,0,dp);
        
    }
}