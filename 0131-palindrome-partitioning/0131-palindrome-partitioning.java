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
    public void helper(String s,List<String> list,List<List<String>> ans,int l,int r,int count)
    {
        if(r==s.length())
        {
            if(count==s.length())
            ans.add(new ArrayList(list));
            return;
        }
        if(check(l,r,s))
        {
            list.add(s.substring(l,r+1));
            helper(s,list,ans,r+1,r+1,count+(r-l+1));
            list.remove(list.size()-1);
            helper(s,list,ans,l,r+1,count);
        }
        else
        {
            helper(s,list,ans,l,r+1,count);
        }
    }
    public List<List<String>> partition(String s) {
        List<String> list=new ArrayList<>();
        List<List<String>> ans=new ArrayList<>();
        helper(s,list,ans,0,0,0);
        return ans;
    }
}