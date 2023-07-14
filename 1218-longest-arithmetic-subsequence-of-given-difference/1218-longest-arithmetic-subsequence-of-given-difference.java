class Solution {
    public int longestSubsequence(int[] nums, int d) {
        int ans=1;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
             if(map.containsKey(nums[i]-d))
             {
                 ans=Math.max(ans,map.get(nums[i]-d)+1);
                 map.put(nums[i],map.get(nums[i]-d)+1);
             }
             else
             map.put(nums[i],1);
        }
        return ans;
    }
}