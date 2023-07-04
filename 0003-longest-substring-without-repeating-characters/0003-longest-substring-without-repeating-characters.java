class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals(""))
        return 0;
        HashMap<Character,Integer>map=new HashMap<>();
        int ans=-1;
        int index=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(!map.containsKey(c))
            {
                map.put(c,i);
            }
            else
            {
                if(index<=map.get(c))
               index=map.get(c)+1;
               map.put(c,i);
            }
            ans=Math.max(ans,(i-index)+1);
        }
        return ans;
    }
}