class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public void helper(int[] nums,int visited[],int count,List<Integer> list)
    {
        if(count==nums.length)
        {
            ans.add(new ArrayList(list));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(visited[i]==0)
            {
                list.add(nums[i]);
                visited[i]=1;
                helper(nums,visited,count+1,list);
                visited[i]=0;
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        int visited[]=new int[nums.length];
        List<Integer> list=new ArrayList<>();
        helper(nums,visited,0,list);
        return ans;
    }
}