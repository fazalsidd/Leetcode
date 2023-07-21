class Solution {
    public int helper(int i,String s,int dp[])
    {
        if(i>=s.length())
            return 1;
        if(Character.getNumericValue(s.charAt(i))==0)
            return 0;
        if(dp[i]!=-1)
            return dp[i];
        int a=helper(i+1,s,dp);
        if(i==s.length()-1)
            return dp[i]=a;
        int b=Character.getNumericValue(s.charAt(i))*10+Character.getNumericValue(s.charAt(i+1));
        if(b>26)
            return dp[i]=a;
        
        return dp[i]=a+helper(i+2,s,dp);
    }
    public int numDecodings(String s){
        int dp[]=new int[s.length()];
        Arrays.fill(dp,-1);
        return helper(0,s,dp);
    }
}