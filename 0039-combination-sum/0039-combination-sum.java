class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public void helper(int[] can, int t,int i,ArrayList<Integer> list)
    {
        if(t<0)
            return;
        if(t==0)
        {
            ans.add(new ArrayList(list));
        }
        for(int j=i;j<can.length;j++)
        {
            list.add(can[j]);
            helper(can,t-can[j],j,list);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] can, int t) {
        ArrayList<Integer> list=new ArrayList<>();
        helper(can,t,0,list);
        return ans;
    }
}