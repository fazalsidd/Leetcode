class Solution {
    public boolean helper(String s, List<String> w,int l,int r,HashMap<String,Boolean> map)
    {
        if(l>r)
            return true;
        
        if(map.containsKey(s.substring(l,r+1)))
            return map.get(s.substring(l,r+1));
        
        for(int i=l;i<=r;i++)
        {
            if(w.contains(s.substring(l,i+1))&&helper(s,w,i+1,r,map))
            {
                map.put(s.substring(l,r+1),true);
                return true;
            }
        }
        
        map.put(s.substring(l,r+1),false);
        return false;
    }
    public boolean wordBreak(String s, List<String> w) {
        HashMap<String,Boolean> map=new HashMap<>();
        return helper(s,w,0,s.length()-1,map);
    }
}