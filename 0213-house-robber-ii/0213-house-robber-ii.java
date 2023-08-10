class Solution {
    public int helper(int[] nums,int t,int i,int dp[])
    {
        if(i>=t)
            return 0;
        if(dp[i]!=-1)
            return dp[i];
        int inc=nums[i]+helper(nums,t,i+2,dp);
        int exc=helper(nums,t,i+1,dp);
        
        return dp[i]=Math.max(inc,exc);
    }
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        int inc=nums[0]+helper(nums,nums.length-1,2,dp);
        Arrays.fill(dp,-1);
        int exc=helper(nums,nums.length,1,dp);
        return Math.max(inc,exc);
    }
}