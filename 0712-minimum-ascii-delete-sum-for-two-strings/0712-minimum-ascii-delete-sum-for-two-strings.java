class Solution {
    public int helper(String s1, String s2,int i,int j,int dp[][])
    {
        if(i==s1.length()&&j==s2.length())
            return 0;
        
        if(i==s1.length())
        {
            int count=0;
            while(j<s2.length())
            {
                count+=s2.charAt(j);
                j++;
            }
            return count;
        }
        
        if(j==s2.length())
        {
            int count=0;
            while(i<s1.length())
            {
                count+=s1.charAt(i);
                i++;
            }
            return count;
        }
        
        if(dp[i][j]!=-1)
            return dp[i][j];
        
        int min=Integer.MAX_VALUE;
        if(s1.charAt(i)==s2.charAt(j))
        {
            min=helper(s1,s2,i+1,j+1,dp);
        }
        else
        {
            min=Math.min(s1.charAt(i)+helper(s1,s2,i+1,j,dp),s2.charAt(j)+helper(s1,s2,i,j+1,dp));
        }
        return dp[i][j]=min;
    }
    public int minimumDeleteSum(String s1, String s2) {
        int dp[][]=new int[s1.length()][s2.length()];
        Arrays.stream(dp).forEach(a -> Arrays.fill(a, -1));
        return helper(s1,s2,0,0,dp);
    }
}