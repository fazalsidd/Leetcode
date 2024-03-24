class Solution {
    
    public String helper(int l,int r,char[] arr,String s)
    {
        while(l>=0&&r<arr.length)
        {
            if(arr[l]!=arr[r])
                break;
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }
    public String longestPalindrome(String s) {
     String ans=s.charAt(0)+"";
        char[] arr=s.toCharArray();
        for(int i=0;i<s.length()-1;i++)
        {
            String odd=helper(i,i,arr,s);
            String even=helper(i,i+1,arr,s);
            if(odd.length()>ans.length())
                ans=odd;
            if(even.length()>ans.length())
                ans=even;
        }
        return ans;
    }
}