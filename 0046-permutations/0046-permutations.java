class Solution {
    public void helper(int[] nums,List<Integer> list,List<List<Integer>> ans,int vis[])
    {
        if(list.size()==nums.length)
            ans.add(new ArrayList(list));
        for(int i=0;i<nums.length;i++)
        {
            if(vis[i]==0)
            {
                list.add(nums[i]);
                vis[i]=1;
                helper(nums,list,ans,vis);
                list.remove(list.size()-1);
                vis[i]=0;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        int vis[]=new int[nums.length];
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        helper(nums,list,ans,vis);
        return ans;
    }
}