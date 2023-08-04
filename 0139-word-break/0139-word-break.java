class Solution {
    HashMap<String,Boolean>map=new HashMap<>();
    public boolean helper(String s,List<String> word)
    {
        int len=s.length();
        if(len==0)
        return true;
        if(map.containsKey(s))
        return map.get(s);
        boolean ans=false;
        for(int i=1;i<=len;i++)
        {
            if(word.contains(s.substring(0,i))&&helper(s.substring(i,len),word))
            {
                ans=true;
                break;
            }
        }
         map.put(s,ans);
         return ans;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        return helper(s,wordDict);
    }
}