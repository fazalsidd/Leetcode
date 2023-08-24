class Solution {
    public void helper(int[] can, int t,List<List<Integer>> ans,List<Integer> list,HashMap<String,Integer> map,int vis[])
    {
        if(t==0)
        {
           String s=Arrays.toString(vis);
            if(!map.containsKey(s))
            {
                map.put(s,1);
            ans.add(new ArrayList(list));
            }
            return;
        }
        if(t<0)
            return;
        for(int i=0;i<can.length;i++)
        {
            vis[i]++;
            list.add(can[i]);
            helper(can,t-can[i],ans,list,map,vis);
            list.remove(list.size()-1);
            vis[i]--;
        }
    }
    public List<List<Integer>> combinationSum(int[] can, int t) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        int vis[]=new int[can.length];
        helper(can,t,ans,list,map,vis);
        return ans;
    }
}