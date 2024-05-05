class Solution {
    public String helper(String s1, String s2,int i,int j,String[][] dp)
    {
        if(i==s1.length()||j==s2.length())
            return "";
        
        if(dp[i][j]!=null)
            return dp[i][j];
        
        String min="";
        if(s1.charAt(i)==s2.charAt(j))
        {
            min=s1.charAt(i)+helper(s1,s2,i+1,j+1,dp);
        }
        else
        {
            String a=helper(s1,s2,i+1,j,dp);
            String b=helper(s1,s2,i,j+1,dp);
            min=a.length()>b.length()?a:b;
        }
        return dp[i][j]=min;
    }
    public String shortestCommonSupersequence(String s1, String s2) {
        String[][] dp=new String[s1.length()][s2.length()];
        String lcs=helper(s1,s2,0,0,dp);
        char[] lcss=lcs.toCharArray();
        StringBuilder ans = new StringBuilder();
        int i=0;
        int j=0;
        for(char c:lcss)
        {
            while(s1.charAt(i)!=c)
            {
                ans.append(s1.charAt(i));
                i++;
            }
            while(s2.charAt(j)!=c)
            {
                ans.append(s2.charAt(j));
                j++;
            }
            ans.append(c);
            i++;
            j++;
        }
        ans.append(s1.substring(i));
        ans.append(s2.substring(j));
        return ans.toString();
    }
}