class Solution {
    public boolean check(int l,int r,String s)
    {
        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        HashMap<Character,ArrayList<Integer>> map=new HashMap<>();
        int max=-1;
        String ans=s.substring(0,1);
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(map.containsKey(c))
            {
                for(int j=0;j<map.get(c).size();j++)
                {
                   if(check(map.get(c).get(j),i,s))
                   {
                       if(i-map.get(c).get(j)+1>max)
                       {
                       ans=s.substring(map.get(c).get(j),i+1);
                           max=i-map.get(c).get(j)+1;
                       }
                       break;
                   }
                }
                ArrayList<Integer> list=map.get(c);
                list.add(i);
                map.put(c,list);
            }
            else
            {
               map.put(c, new ArrayList<Integer>(Arrays.asList(i))); 
            }
        }
        return ans;
    }
}