class Solution {
    public String helper(int l,int r,String s)
    {
        while(l>=0&&r<s.length())
        {
            if(s.charAt(l)!=s.charAt(r))
                break;
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }
    public String longestPalindrome(String s) {
       String ans="";
        for(int i=0;i<s.length()-1;i++)
        {
            String temp1=helper(i,i,s);
            String temp2=helper(i,i+1,s);
            if(temp1.length()>ans.length())
                ans=temp1;
            if(temp2.length()>ans.length())
                ans=temp2;
        }
        return ans.length()==0?s:ans;
    }
}