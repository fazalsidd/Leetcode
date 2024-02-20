class Solution {
    ArrayList<List<Integer>> ans=new ArrayList<>();
    public void helper(ArrayList<Integer> list,int j,int[] nums,int tar)
    {
        if(tar==0)
        {
            ans.add(new ArrayList(list));
        }
        if(j>=nums.length||tar<0)
        {
            return;
        }
        int dub=100;
        for(int i=j;i<nums.length;i++)
        {
            if(nums[i]!=dub)
            {
                list.add(nums[i]);
                helper(list,i+1,nums,tar-nums[i]);
                list.remove(list.size()-1);
                dub=nums[i];
            }
        }
    }
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> list=new ArrayList<>();
        helper(list,0,nums,target);
        return ans;
    }
}