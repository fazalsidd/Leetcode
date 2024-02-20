class Solution {
    ArrayList<List<Integer>> ans=new ArrayList<>();
    public void helper(ArrayList<Integer> list,int vis[],int[] nums)
    {
        if(list.size()==vis.length)
        {
            ans.add(new ArrayList(list));
        }
        for(int i=0;i<vis.length;i++)
        {
            if(vis[i]==0)
            {
                list.add(nums[i]);
                vis[i]=1;
                helper(list,vis,nums);
                list.remove(list.size()-1);
                vis[i]=0;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int vis[]=new int[nums.length];
        helper(list,vis,nums);
        return ans;
    }
}