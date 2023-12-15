class Solution {
    HashMap<String,String> map=new HashMap<>();
    public String helper(String s)
    {
        if(!map.containsKey(s))
            return s;
        
        String temp=map.get(s);
        return helper(temp);
    }
    public String destCity(List<List<String>> paths) {
        for(int i=0;i<paths.size();i++)
        {
            map.put(paths.get(i).get(0),paths.get(i).get(1));
        }
        return helper(paths.get(0).get(0));
    }
}