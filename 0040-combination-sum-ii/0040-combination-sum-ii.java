class Solution {
    public void helper(int[] can, int t,List<List<Integer>> ans,List<Integer> list,int i)
    {
        if(t==0)
        {
            ans.add(new ArrayList(list));
            return;
        }
        if(t<0)
            return ;
        int prev=0;
        for(int j=i;j<can.length;j++)
        {
            if(can[j]!=prev)
            {
                prev=can[j];
                list.add(can[j]);
                helper(can,t-can[j],ans,list,j+1);
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<Integer>> combinationSum2(int[] can, int t) {
        Arrays.sort(can);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        helper(can,t,ans,list,0);
        return ans;
    }
}