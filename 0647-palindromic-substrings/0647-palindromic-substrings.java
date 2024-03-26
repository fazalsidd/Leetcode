class Solution {
    public int helper(int l,int r,String s)
    {
        int ans=0;
        while(l>=0&&r<s.length())
        {
            if(s.charAt(l)==s.charAt(r))
                ans+=1;
            else 
                break;
            l--;
            r++;
        }
        return ans;
    }
    public int countSubstrings(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            ans+=helper(i,i+1,s)+helper(i,i,s);
        }
        return ans;
    }
}