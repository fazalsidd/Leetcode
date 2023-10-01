class Solution {
    public String reverseWords(String s) {
        String temp="";
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=32)
            {
                temp=s.charAt(i)+temp;
            }
            else
            {
                ans=ans+temp+" ";
                temp="";
            }
        }
        return ans+temp;
    }
}