class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public void helper(int n, int k,List<Integer> list,int j)
    {
        if(k==0)
        {
            ans.add(new ArrayList(list));
            return;
        }
        if(j>n)
        {
            return;
        }
        list.add(j);
        helper(n,k-1,list,j+1);
        list.remove(list.size()-1);
        helper(n,k,list,j+1);
    }
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list=new ArrayList<>();
        helper(n,k,list,1);
        return ans;
    }
}