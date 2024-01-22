class Solution {
    public int helper(int i,String s,int dp[])
    {
        if(i>=s.length())
            return 1;
        if(s.charAt(i)=='0')
            return 0;
        if(dp[i]!=-1)
            return dp[i];
        int ans=0;
        ans+=helper(i+1,s,dp);
        if(i<s.length()-1)
        {
            int n=Integer.parseInt(s.substring(i,i+2));
            if(n<=26)
                ans+=helper(i+2,s,dp);
        }
        return dp[i]=ans;
    }
    public int numDecodings(String s) {
        int dp[]=new int[s.length()];
        Arrays.fill(dp,-1);
        return helper(0,s,dp);
    }
}