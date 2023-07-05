class Solution {
    ArrayList<List<Integer>> ans=new ArrayList<>();
    public void helper(int[] c, int t,int i,int sum,ArrayList<Integer> list)
    {
        if(sum==t)
        {
            ans.add(new ArrayList(list));
            return;
        }
        if(sum>t)
            return;
        for(int j=i;j<c.length;j++)
        {
            list.add(c[j]);
            helper(c,t,j,sum+c[j],list);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] c, int t) {
        ArrayList<Integer> list=new ArrayList<>();
        helper(c,t,0,0,list);
        return ans;
    }
}