class Solution {
    public int helper(int[] nums, int i,int t,int dp[][])
    {
        if(i>=nums.length)
        {
            if(t==0)
                return 1;
            
            return 0;
        }
        if(dp[1000+t][i]!=-1)
            return dp[1000+t][i];
        
        return dp[1000+t][i]=helper(nums,i+1,t-nums[i],dp)+helper(nums,i+1,t+nums[i],dp);
    }
    public int findTargetSumWays(int[] nums, int target) {
        if(target<0)
            target*=-1;
        
        int dp[][]=new int[2000+target][nums.length];
        
        Arrays.stream(dp).forEach(a -> Arrays.fill(a, -1));
        return helper(nums,0,target,dp);
    }
}