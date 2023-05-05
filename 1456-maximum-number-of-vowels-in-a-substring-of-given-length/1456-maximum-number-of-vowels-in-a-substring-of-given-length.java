class Solution {
    public boolean isvowel(char c)
    {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        return true;

        return false;
    }
    public int maxVowels(String s, int k) {
        int ans=0;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(i<k)
            {
                 if(isvowel(s.charAt(i)))
                 count++;
            }
            else
            {
               if(isvowel(s.charAt(i)))
                 count++;
                 if(isvowel(s.charAt(i-k)))
                 count--;
            }
            ans=Math.max(ans,count);
        }
        return ans;
    }
}