class Solution {
        ArrayList<List<Integer>> ans=new ArrayList<>();
    public void helper(ArrayList<Integer> list,int j,int[] nums)
    {
        if(j>=nums.length)
        {
            ans.add(new ArrayList(list));
            return;
        }
        int dub=100;
        for(int i=j;i<nums.length;i++)
        {
            if(nums[i]!=dub)
            {
                list.add(nums[i]);
                helper(list,i+1,nums);
                list.remove(list.size()-1);
                dub=nums[i];
            }
        }
        helper(list,nums.length,nums);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list=new ArrayList<>();
        helper(list,0,nums);
        return ans;
    }
}