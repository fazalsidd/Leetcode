class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length())
            return false;
        int c[]=new int[2];
        int alp[]=new int[26];
        int k=0;
        boolean check=false;
        for(int i=0;i<s.length();i++)
        {
            alp[s.charAt(i)-'a']++;
            if(alp[s.charAt(i)-'a']>=2)
            {
               check=true; 
            }
            if(s.charAt(i)!=goal.charAt(i))
            {
               if(k>=2)
               {
                  return false; 
               }
                else if(k==1)
                {
                    if(s.charAt(i)==goal.charAt(c[0])&&goal.charAt(i)==s.charAt(c[0]))
                    {
                        k++;
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    c[k]=i;
                    k++;
                }
            }
        }
        if(k==1)
            return false;
        
        if(k==0&&!check)
            return false;
        
        return true;
    }
}