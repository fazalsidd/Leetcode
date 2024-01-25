class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public void helper(int i,ArrayList<Integer> list,int[] nums)
    {
        if(i>=nums.length)
        {
            ans.add(new ArrayList(list));
            return ;
        }
        list.add(nums[i]);
        helper(i+1,list,nums);
        list.remove(list.size()-1);
        helper(i+1,list,nums);
    }
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        helper(0,list,nums);
        return ans;
    }
}