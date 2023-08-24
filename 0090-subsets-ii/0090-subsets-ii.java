class Solution {
    public void helper(int[] nums,List<List<Integer>> ans,List<Integer> list,int i)
    {
        if(i==nums.length)
        {
            ans.add(new ArrayList(list));
            return;
        }
        int pre=-100;
        for(int j=i;j<nums.length;j++)
        {
            if(nums[j]!=pre)
            {
                pre=nums[j];
                list.add(nums[j]);
                helper(nums,ans,list,j+1);
                list.remove(list.size()-1);
            }
        }
        helper(nums,ans,list,nums.length);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        helper(nums,ans,list,0);
        return ans;
    }
}