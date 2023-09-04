class Solution {
    public int helper(String s,int l,int r)
    {
        int count=0;
        while(l>=0&&r<s.length())
        {
            if(s.charAt(l)!=s.charAt(r))
            {
                return count;
            }
            l--;
            r++;
            count++;
        }
        return count;
    }
    public int countSubstrings(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
           ans+=helper(s,i,i+1);
            ans+=helper(s,i,i);
        }
        return ans;
    }
}