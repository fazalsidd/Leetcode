class Solution {
    ArrayList<List<String>> ans=new ArrayList<>();
    public boolean palindrome(int l,int r,String s)
    {
        while(l<=r)
        {
            if(s.charAt(l)!=s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
    public void helper(int l,String s,ArrayList<String> list)
    {
        if(l>=s.length())
        {
            ans.add(new ArrayList(list));
            
            return;
        }
        for(int i=l;i<s.length();i++)
        {
            if(palindrome(l,i,s))
            {
                list.add(s.substring(l,i+1));
                helper(i+1,s,list);
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        ArrayList<String> list=new ArrayList<>();
        helper(0,s,list);
        return ans;
    }
}