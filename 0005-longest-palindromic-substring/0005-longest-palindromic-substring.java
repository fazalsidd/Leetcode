class Solution {
    public String helper(int l,int r,String s)
    {
        while(l>=0&&r<s.length())
        {
            if(s.charAt(l)!=s.charAt(r))
            {
                return s.substring(l+1,r);
            }
            l--;
            r++;
        }
        if(l<0)
            return s.substring(0,r);
        
        return s.substring(l+1,r);
    }
    public String longestPalindrome(String s) {
        int dp[]=new int[s.length()];
        dp[0]=0;
        int max=1;
        String ans=s.substring(0,1);
        for(int i=0;i<s.length();i++)
        {
            String p=helper(i,i,s);
            String q=helper(i,i+1,s);
            if(p.length()>max)
               { max=p.length();
                ans=p;}
            if(q.length()>max)
                {
                max=q.length();
                ans=q;
                }
        }
        return ans;
    }
}