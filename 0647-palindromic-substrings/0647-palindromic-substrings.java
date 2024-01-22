class Solution {
    public int helper(int l,int r,String s)
    {
        int ans=0;
        while(l>=0&&r<s.length())
        {
            if(s.charAt(l)!=s.charAt(r))
                break;
            l--;
            r++;
            ans++;
        }
        return ans;
    }
    public int countSubstrings(String s) {
        int ans=0;
        for(int i=0;i<s.length()-1;i++)
        {
            ans+=helper(i,i,s);
            ans+=helper(i,i+1,s);
        }
        return ans+1;
    }
}