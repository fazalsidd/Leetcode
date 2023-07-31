class Solution {
    public int sum(String s,int v)
    {
        int su=0;
        for(int i=v;i<s.length();i++)
        {
            su+=(int)s.charAt(i);
        }
        return su;
    }
    public int minimumDeleteSum(String s1, String s2,int v1,int v2,int[][]dp) 
    {
        if(v1==s1.length()&&v2==s2.length())
        return 0;
        if(v1==s1.length()&&v2!=s2.length())
        {
            return sum(s2,v2);
        }
        if(v1!=s1.length()&&v2==s2.length())
        {
            return sum(s1,v1);
        }
        char ch=s1.charAt(v1);
        char ch1=s2.charAt(v2);
    
        if(dp[v1][v2]!=-1)
        return dp[v1][v2];
        if(ch==ch1)
        {
           dp[v1][v2]=minimumDeleteSum(s1,s2,v1+1,v2+1,dp);
        }
        else
        {
            int a=minimumDeleteSum(s1,s2,v1+1,v2,dp)+(int)(s1.charAt(v1));
            int b= minimumDeleteSum(s1,s2,v1,v2+1,dp)+(int)(s2.charAt(v2));
           dp[v1][v2]= Math.min(a,b);
        }
        return dp[v1][v2];
        
    }
    public int minimumDeleteSum(String s1,String s2)
    {
        int dp[][]=new int[s1.length()][s2.length()];
        for(int i=0;i<s1.length();i++)
        {
            for(int j=0;j<s2.length();j++)
            {
                dp[i][j]=-1;
            }
        }
        return minimumDeleteSum(s1,s2,0,0,dp);
    }
}